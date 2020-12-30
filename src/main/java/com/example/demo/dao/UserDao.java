package com.example.demo.dao;

import com.example.po.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Insert("insert into users(name,age)values(#{name},#{age})")
    public void save(User user);
    @Update("update users set name=#{name},age=#{age} where id=#{id}")
    public void update(User user);
    @Delete("delete from users where id=#{id}")
    public void delete(Long id);
    @Select("select * from users")
    public List<User> getAll();
    @Select("select * from users where id=#{id}")
    public User findOne(Long id);
}
