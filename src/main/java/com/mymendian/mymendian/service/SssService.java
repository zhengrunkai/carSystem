package com.mymendian.mymendian.service;

import com.mymendian.mymendian.model.Sss;

public interface SssService {
    //添加
    public  void insertSss(Sss sss);
    //删除
    public void deleteSss(String yi);
    //修改 更新
    public void updateSss(Sss sss);
    //查询
    public Sss findSssById(int id);
    //查询
    public Sss findSssByyi(String yi);

    String getSssInit();
}
