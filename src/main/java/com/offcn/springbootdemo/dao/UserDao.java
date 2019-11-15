package com.offcn.springbootdemo.dao;

import com.offcn.springbootdemo.po.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {

   @Select("select * from users")
    public List<User> findAll();
    @Select("select * from users where id =#{id}")
    public User findOneById(Integer id);
    @Insert("insert into users (username,password) values (#{username},#{password})")
    public void addUser(User user);
    @Update("update users set username = #{username} password =#{password} where id =#{id}")
    public void updateUser(User user);
    @Delete("delect from users where id =#{id} ")
    public void deleteUser(Integer id);
}
