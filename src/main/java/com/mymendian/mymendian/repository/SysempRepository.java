package com.mymendian.mymendian.repository;

import com.mymendian.mymendian.model.Sysemp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysempRepository extends JpaRepository<Sysemp,String> {
    Sysemp findSysempByUid(int uid);
}
