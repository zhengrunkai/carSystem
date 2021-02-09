package com.mymendian.mymendian.dao;

import com.mymendian.mymendian.model.Jinchuhuodan;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface JinchuhuodanDao {
    //添加
    public  void insertJinchuhuodan(@Param("jinchuhuodan") Jinchuhuodan jinchuhuodan);
    //删除
    public void deleteJinchuhuodan(int id);
    //修改 更新
    public void updateJinchuhuodan(@Param("jinchuhuodan") Jinchuhuodan jinchuhuodan);
    //查询
    public  Jinchuhuodan findJinchuhuodanById(int id);
    //查询
    public  Jinchuhuodan findJinchuhuodanByJinchuhuodan_id(@Param("jinchuhuodan_id") int jinchuhuodan_id);

    //查询最后n条记录
    public List<Jinchuhuodan> findJinchuhuodanLast(int n);
}
