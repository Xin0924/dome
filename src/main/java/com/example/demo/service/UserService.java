package com.example.demo.service;

import com.example.po.User;

import java.util.List;

public interface UserService {
    //获取全部用户数据
    public List<User> getUserList();
    //新增用户数据
    public void createUser(User user);
    //获取指定ID用户信息
    public User getUser(Long id);
    //更新指定ID用户数据
    public void updateUser(Long id,User user);
    //删除指定ID用户
    public void delete(Long id);
}
