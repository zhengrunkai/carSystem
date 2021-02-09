package com.mymendian.mymendian.dao;


import com.mymendian.mymendian.model.Cheliang;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface CheliangDao {
    //添加
    public  void insertCheliang(@Param("cheliang") Cheliang cheliang);
    //删除
    public void deleteCheliang(int id);
    //修改 更新
    public void updateCheliang(@Param("cheliang") Cheliang cheliang);
    //查询
    public  Cheliang findCheliangById(int id);
    //查询
    public  Cheliang findCheliangByCheliang_id(@Param("cheliang_id") int cheliang_id);

    //查询最后n条记录
    public List<Cheliang> findCheliangLast(int n);
}
