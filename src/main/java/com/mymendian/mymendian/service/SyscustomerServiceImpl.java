package com.mymendian.mymendian.service;

import com.mymendian.mymendian.dao.SyscustomerDao;
import com.mymendian.mymendian.model.Syscustomer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SyscustomerServiceImpl implements SyscustomerService {
    @Resource
    SyscustomerDao syscustomerDao;
    @Override
    public void insertSyscustomer(Syscustomer syscustomer) {
        syscustomerDao.insertSyscustomer(syscustomer);
    }
    @Override
    public void deleteSyscustomer(int id) {
        syscustomerDao.deleteSyscustomer(id);
    }
    @Override
    public void updateSyscustomer(Syscustomer syscustomer) {
        syscustomerDao.updateSyscustomer(syscustomer);
    }
    @Override
    public Syscustomer findSyscustomerById(int id) {
        return syscustomerDao.findSyscustomerById(id);
    }
    @Override
    public Syscustomer findSyscustomerByCustomerid(int customerid) {
        return syscustomerDao.findSyscustomerByCustomerid(customerid);
    }
    @Override
    public String getSyscustomerInit() {
        String syscustomerInit="";
        List<Syscustomer> scL=syscustomerDao.findSyscustomerLast(10);
        if(scL.size()>0){
            String showtype="success";
            for(Syscustomer sc:scL){
                if(showtype.equals("active"))   showtype="success";
                else showtype="active";
                syscustomerInit +="$(\"table tbody\").append(\"<tr class=\\\""+showtype+"\\\"><td>"
                        +sc.getCustomerid()+"</td><td>"+sc.getCustomertelephone()+"</td><td>"+sc.getCustomerphonetypename()
                        +"</td><td>"+sc.getCustomername()+"</td><td>"+sc.getCustomerwhetherflow()+"</td><td>"
                        +sc.getIsoutmealflow()+"</td><td>"+sc.getCustomermealname()+"</td></tr>\");";
            }
        }
        return syscustomerInit;
    }
}
