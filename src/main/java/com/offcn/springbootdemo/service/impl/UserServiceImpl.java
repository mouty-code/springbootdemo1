package com.offcn.springbootdemo.service.impl;

import com.offcn.springbootdemo.dao.UserDao;
import com.offcn.springbootdemo.po.User;
import com.offcn.springbootdemo.service.CarService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl  implements CarService {

   @Autowired
   private UserDao dao;

    @Override
    @ApiOperation(value = "查询全部用户信息",notes = "查询全部用户信息")
    public List<User> findAll() {


        return dao.findAll();
    }

    @Override
    @ApiOperation(value ="根据Id查找用户信息",notes = "根据Id查找用户信息")
    @ApiImplicitParam(name="id",value = "用户id",dataType = "Integer",required = true)
    public User findOneById(Integer id) {

        return dao.findOneById(id);
    }

    @ApiOperation(value = "添加用户信息",notes = "添加用户信息")
    @ApiImplicitParam(name = "user",value = "用户信息实体",dataType = "User",required = true)
    @Override
    public void addUser(User user) {
        System.out.println(user.getUsername());
        dao.addUser(user);

    }

    @ApiOperation(value ="根据id更新用户信息",notes = "更新用户信息")
    @ApiImplicitParam(name="user",value = "用户信息实体",required = true,dataType = "User")

    @Override
    public void updateUser( User user) {

        dao.updateUser(user);
    }

    @ApiOperation(value = "根据用户id删除用户信息",notes = "删除用户信息")
    @ApiImplicitParam(name="id",value = "用户id",required = true,dataType = "Integer")
    @Override
    public void deleteUser(Integer id) {

        dao.deleteUser(id);
    }
}
