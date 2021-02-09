package com.mymendian.mymendian.service;

import com.mymendian.mymendian.model.Jinchuhuodan;

public interface JinchuhuodanService {
    //添加
    public  void insertJinchuhuodan(Jinchuhuodan jinchuhuodan);
    //删除
    public void deleteJinchuhuodan(int id);
    //修改 更新
    public void updateJinchuhuodan(Jinchuhuodan jinchuhuodan);
    //查询
    public Jinchuhuodan findJinchuhuodanById(int id);
    //查询
    public Jinchuhuodan findJinchuhuodanByJinchuhuodan_id(int jinchuhuodan_id);

    String getJinchuhuodanInit();
}
