package com.mymendian.mymendian.dao;

import com.mymendian.mymendian.model.Shouhoudan;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface ShouhoudanDao {
    //添加
    public  void insertShouhoudan(@Param("shouhoudan") Shouhoudan shouhoudan);
    //删除
    public void deleteShouhoudan(int id);
    //修改 更新
    public void updateShouhoudan(@Param("shouhoudan")Shouhoudan shouhoudan);
    //查询
    public  Shouhoudan findShouhoudanById(int id);
    //查询
    public  Shouhoudan findShouhoudanByShouhoudan_id(@Param("shouhoudan_id") int shouhoudan_id);

    //查询最后n条记录
    public List<Shouhoudan> findShouhoudanLast(int n);
}
