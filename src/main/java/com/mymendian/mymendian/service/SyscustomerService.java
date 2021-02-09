package com.mymendian.mymendian.service;

import com.mymendian.mymendian.model.Syscustomer;

public interface SyscustomerService {
    //添加
    public  void insertSyscustomer(Syscustomer syscustomer);
    //删除
    public void deleteSyscustomer(int id);
    //修改 更新
    public void updateSyscustomer(Syscustomer syscustomer);
    //查询
    public Syscustomer findSyscustomerById(int id);
    //查询
    public Syscustomer findSyscustomerByCustomerid(int customerid);

    String getSyscustomerInit();
}
