package com.mymendian.mymendian.dao;

import com.mymendian.mymendian.model.Syscustomer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface SyscustomerDao {
    //添加
    public  void insertSyscustomer(@Param("syscustomer") Syscustomer syscustomer);
    //删除
    public void deleteSyscustomer(int id);
    //修改 更新
    public void updateSyscustomer(@Param("syscustomer") Syscustomer syscustomer);
    //查询
    public  Syscustomer findSyscustomerById(int id);
    //查询
    public  Syscustomer findSyscustomerByCustomerid(@Param("customerid") int customerid);

    //查询最后n条记录
    public List<Syscustomer> findSyscustomerLast(int n);
}
