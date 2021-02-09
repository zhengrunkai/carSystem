package com.mymendian.mymendian.dao;

import com.mymendian.mymendian.model.Sss;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface SssDao {
    //添加
    public  void insertSss(@Param("sss") Sss sss);
    //删除
    public void deleteSss(String yi);
    //修改 更新
    public void updateSss(@Param("sss")Sss sss);
    //查询
    public  Sss findSssById(int id);
    //查询
    public  Sss findSssByyi(@Param("yi") String yi);

    //查询最后n条记录
    public List<Sss> findSssLast(int n);
}
