package com.example.demo.controller;

import com.example.po.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserControllerDb {
    @Autowired
    private UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @GetMapping("/")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    /**
     * 新增用户
     * @param user
     * @return
     */
    @PostMapping("/")
    public String createUser(User user){
        userService.createUser(user);
        return "success";
    }
    /**
     * 获取指定ID用户信息
     */
    @GetMapping("/{id}")
    public User getUser(@PathVariable("id")Long id){
        return userService.getUser(id);
    }

    /**
     * 更新指定ID用户信息
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id")Long id,User user){
        userService.updateUser(id,user);
        return "success";
    }

    /**
     * 删除指定ID用户
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id")Long id){
        userService.delete(id);
        return "success";
    }
}
