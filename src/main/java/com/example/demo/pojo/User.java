package com.example.demo.pojo;

import lombok.Data;

//@Data
public class User {
    private Integer user_id;
    private String user_email;
    private String password_hash;
//    password 最好用char[]存储 之后优化

    public User(String email, String passwordhash){
        if(email != null && passwordhash != null)
        {
            user_email = email;
            password_hash = passwordhash;
        }
    }
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }
}
