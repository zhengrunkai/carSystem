package com.mymendian.mymendian.service;

import com.mymendian.mymendian.model.Shouhoudan;

public interface ShouhoudanService {
    //添加
    public  void insertShouhoudan(Shouhoudan shouhoudan);
    //删除
    public void deleteShouhoudan(int id);
    //修改 更新
    public void updateShouhoudan(Shouhoudan shouhoudan);
    //查询
    public Shouhoudan findShouhoudanById(int id);
    //查询
    public Shouhoudan findShouhoudanByShouhoudan_id(int shouhoudan_id);

    String getShouhoudanInit();
}
