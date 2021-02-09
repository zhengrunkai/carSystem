package com.mymendian.mymendian.service;

import com.mymendian.mymendian.model.Sysemp;
import com.mymendian.mymendian.repository.SysempRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysempServiceImpl implements SysempService {
    @Resource
    SysempRepository sysempRepository;
    @Override

    public Sysemp findbyId(String id) {
        return sysempRepository.findById(id).orElse(null);
    }
    public Sysemp findSysempByUid(int uid){
        return sysempRepository.findSysempByUid(uid);
    }
    @Override
    public List<Sysemp> findAll() {
        return sysempRepository.findAll();
    }
    @Override
    public Sysemp save(Sysemp aEmp) {
        return sysempRepository.save(aEmp);
    }
    @Override
    public boolean delete(String id) {
        Sysemp aEmp=findbyId(id);
        if(aEmp!=null) {
            sysempRepository.delete(aEmp);
            return true;
        }else{
            return  false;
        }
    }
}