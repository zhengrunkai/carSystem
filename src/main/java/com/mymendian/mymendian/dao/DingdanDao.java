package com.mymendian.mymendian.dao;

import com.mymendian.mymendian.model.Dingdan;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface DingdanDao {
    //添加
    public  void insertDingdan(@Param("dingdan") Dingdan dingdan);
    //删除
    public void deleteDingdan(int id);
    //修改 更新
    public void updateDingdan(@Param("dingdan") Dingdan dingdan);
    //查询
    public  Dingdan findDingdanById(int id);
    //查询
    public  Dingdan findDingdanByDingdan_id(@Param("dingdan_id") int dingdan_id);

    //查询最后n条记录
    public List<Dingdan> findDingdanLast(int n);
}
