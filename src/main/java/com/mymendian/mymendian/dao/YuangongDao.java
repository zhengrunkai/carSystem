package com.mymendian.mymendian.dao;

import com.mymendian.mymendian.model.Yuangong;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Mapper
public interface YuangongDao {
    //添加
    public  void insertYuangong(@Param("yuangong") Yuangong yuangong);
    //删除
    public void deleteYuangong(int id);
    //修改 更新
    public void updateYuangong(@Param("yuangong") Yuangong yuangong);
    //查询
    public  Yuangong findYuangongById(int id);
    //查询
    public  Yuangong findYuangongByYuangong_id(@Param("yuangong_id") int yuangong_id);

    //查询最后n条记录
    public List<Yuangong> findYuangongLast(int n);
}
