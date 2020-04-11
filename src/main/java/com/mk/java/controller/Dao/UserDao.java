package com.mk.java.controller.Dao;

import com.mk.java.controller.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserDao {

    List<User> queryAllUsers();
}
