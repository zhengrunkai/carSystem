package com.mymendian.mymendian.service;

import com.mymendian.mymendian.model.Sysemp;

import java.util.List;

public interface SysempService {
    Sysemp findbyId(String id);
    Sysemp findSysempByUid(int uid);
    List<Sysemp> findAll();
    Sysemp save(Sysemp aEmp);
    boolean delete(String id);
}