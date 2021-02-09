package com.mymendian.mymendian.service;

import com.mymendian.mymendian.model.Yuangong;

public interface YuangongService {
    //添加
    public  void insertYuangong(Yuangong yuangong);
    //删除
    public void deleteYuangong(int id);
    //修改 更新
    public void updateYuangong(Yuangong yuangong);
    //查询
    public Yuangong findYuangongById(int id);
    //查询
    public Yuangong findYuangongByYuangong_id(int yuangong_id);

    String getYuangongInit();
}
