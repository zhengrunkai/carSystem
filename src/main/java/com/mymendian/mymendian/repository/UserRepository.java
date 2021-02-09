package com.mymendian.mymendian.repository;

import com.mymendian.mymendian.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUsername(String username);
}