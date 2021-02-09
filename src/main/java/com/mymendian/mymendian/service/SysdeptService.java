package com.mymendian.mymendian.service;

import com.mymendian.mymendian.model.Sysdept;

public interface SysdeptService {
    //添加
    public  void insertSysdept(Sysdept sysdept);
    //删除
    public void deleteSysdept(int id);
    //修改 更新
    public void updateSysdept(Sysdept sysdept);
    //查询
    public Sysdept findSysdeptById(int id);
    //查询
    public Sysdept findSysdeptByDeptid(int deptid);
}
