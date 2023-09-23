package com.example.demo.service.Impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.midi.Track;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findALLUser(){
        List<User> allUser = userMapper.findALLUser();
        return allUser;
    }
    @Override
//    需要优化，目前是用户存在就跳转页面
//    优化需要用token，携带用户信息
    public Integer judgeUser(String email){
        Integer user_id = userMapper.judgeUser(email);
        if(user_id != null)
            return user_id;
        return 0;
    }
}
