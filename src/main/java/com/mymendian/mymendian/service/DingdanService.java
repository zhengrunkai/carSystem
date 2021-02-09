package com.mymendian.mymendian.service;

import com.mymendian.mymendian.model.Dingdan;

public interface DingdanService {
    //添加
    public  void insertDingdan(Dingdan dingdan);
    //删除
    public void deleteDingdan(int id);
    //修改 更新
    public void updateDingdan(Dingdan dingdan);
    //查询
    public Dingdan findDingdanById(int id);
    //查询
    public Dingdan findDingdanByDingdan_id(int dingdan_id);

    String getDingdanInit();
}
