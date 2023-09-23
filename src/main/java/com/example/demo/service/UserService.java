package com.example.demo.service;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {
    List<User> findALLUser();//    返回数据库中所有用户数据

    Integer judgeUser(String email);//     判断用户是否在数据库中，如果是则返回主键user_id
}

