package com.offcn.springbootdemo.userdemo;

import com.offcn.springbootdemo.po.User;
import com.offcn.springbootdemo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserControllerDb {

    @Autowired
    private CarService carService;

    @PostMapping("/")
    public String addUser(@RequestBody User user){

        carService.addUser(user);
        return "add-ok";
    }
    @GetMapping("/findAll")
    public List<User> findAll(){
        return carService.findAll();
    }

    @GetMapping("/{id}")
    public User findOne(@PathVariable("id") Integer id){

        return carService.findOneById(id);
    }

    @PutMapping("/")
    public String updateUser(User user){
        carService.updateUser(user);

        return  "update-ok";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id")Integer id){
        carService.deleteUser(id);
        return "delete-ok";
    }

}
