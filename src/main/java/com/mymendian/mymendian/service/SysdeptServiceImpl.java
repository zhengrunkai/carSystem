package com.mymendian.mymendian.service;

import com.mymendian.mymendian.dao.SysdeptDao;
import com.mymendian.mymendian.model.Sysdept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysdeptServiceImpl implements SysdeptService {
    @Resource
    private SysdeptDao sysdeptDao;
    @Override
    public void insertSysdept(Sysdept sysdept) {
        sysdeptDao.insertSysdept(sysdept);
    }
    @Override
    public void deleteSysdept(int id) {
        sysdeptDao.deleteSysdept(id);
    }
    @Override
    public void updateSysdept(Sysdept sysdept) {
        sysdeptDao.updateSysdept(sysdept);
    }
    @Override
    public Sysdept findSysdeptById(int id) {
        return sysdeptDao.findSysdeptById(id);
    }
    @Override
    public Sysdept findSysdeptByDeptid(int deptid) {
        return sysdeptDao.findSysdeptByDeptid(deptid);
    }
}

