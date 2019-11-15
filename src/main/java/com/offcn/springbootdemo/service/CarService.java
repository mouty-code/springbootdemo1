package com.offcn.springbootdemo.service;



import com.offcn.springbootdemo.po.User;

import java.util.List;

public interface CarService {


    public List<User> findAll();

    public User findOneById(Integer id);

    public void addUser(User user);

    public void updateUser(Long id,User user);

    public void deleteUser(Integer id);

    //开发者新增方法
    public void test005();

    public void test006();

}
