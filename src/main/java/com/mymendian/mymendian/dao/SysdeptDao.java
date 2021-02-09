package com.mymendian.mymendian.dao;

import com.mymendian.mymendian.model.Sysdept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

@Mapper
public interface SysdeptDao {
    //添加
    public  void insertSysdept(@Param("sysdept") Sysdept sysdept);
    //删除
    public void deleteSysdept(int id);
    //修改 更新
    public void updateSysdept(@Param("sysdept") Sysdept sysdept);
    //查询
    public  Sysdept findSysdeptById(int id);
    //查询
    public  Sysdept findSysdeptByDeptid(@Param("deptid") int deptid);
}
