package com.example.demo.controller;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TestController {
    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public List<User> getALLUser(){
        List<User> allUser = userService.findALLUser();
//        System.out.println(allUser);
        return allUser;
    }
    @PostMapping("/login")
    public int userLogin(@RequestBody User user){
        boolean True,False;
        Integer result = userService.judgeUser(user.getUser_email());
        if (result!=0){
            return 1;
        }
        return 0;
    }

}
