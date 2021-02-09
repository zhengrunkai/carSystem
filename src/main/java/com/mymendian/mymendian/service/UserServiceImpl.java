package com.mymendian.mymendian.service;

import com.mymendian.mymendian.model.User;
import com.mymendian.mymendian.repository.UserRepository;
import com.mymendian.mymendian.util.Comm;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;
    @Override
    public User findbyId(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public  User findbyName(String username) { return userRepository.findByUsername(username); }
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @Override
    public User save(User aUser) {
        User vUser=userRepository.findByUsername((aUser.getUsername().toString()));
        if(vUser == null){
            aUser.setRolename("1");
            aUser.setUserrights("0");
            aUser.setRolenumber(1);
            aUser.setRoledescription("普通注册");
            //生成随机码，用于验证邮箱
            aUser.setUsercheck(Comm.getRandom(8));
            return userRepository.save(aUser);
        }else{
            return null;
        }

    }
    @Override
    public void delete(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public boolean verifyLogin(User user){
        User gUser= userRepository.findByUsername((user.getUsername().toString()));
        if(gUser!=null){
            if(gUser.getUserpassword().equals(user.getUserpassword()) && Integer.parseInt(gUser.getUserrights())>0){
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }
    }

    @Override
    public boolean verifyEmail(User user){
        User gUser= userRepository.findByUsername((user.getUsername().toString()));
        if(gUser!=null){
            if(gUser.getUsercheck().equals(user.getUsercheck())){
                gUser.setUserrights("1");
                gUser.setUsercheck("");
                gUser.setRoledescription(gUser.getRoledescription()+"->邮箱验证成功");
                userRepository.save(gUser);
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }
    }

}