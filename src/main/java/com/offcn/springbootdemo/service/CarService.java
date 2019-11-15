package com.offcn.springbootdemo.service;



import com.offcn.springbootdemo.po.User;

import java.util.List;

public interface CarService {


    public List<User> findAll();

    public User findOneById(Integer id);

    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUser(Integer id);
}