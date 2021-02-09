package com.mymendian.mymendian.service;

import com.mymendian.mymendian.model.Cheliang;

public interface CheliangService {
    //添加
    public  void insertCheliang(Cheliang cheliang);
    //删除
    public void deleteCheliang(int id);
    //修改 更新
    public void updateCheliang(Cheliang cheliang);
    //查询
    public Cheliang findCheliangById(int id);
    //查询
    public Cheliang findCheliangByCheliang_id(int cheliang_id);

    String getCheliangInit();
}
