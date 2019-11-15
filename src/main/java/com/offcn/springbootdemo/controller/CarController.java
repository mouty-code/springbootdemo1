package com.offcn.springbootdemo.controller;

import com.offcn.springbootdemo.po.Car;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/getCar")
    public Car getCar(){

        return new Car("奔驰",1,2222.22d,new Date());

    }

    @RequestMapping("/setCar")
    public Car setCar(String name){
        Car car=new Car();
        car.setId(2);
        car.setPrive(8888.22d);
        car.setName(name);
        return car;

    }

    @RequestMapping("/updateCar/{id}/{name}")
    public Car updateCar(@RequestParam(name="prive") Double prive,@PathVariable("id")Integer id,@PathVariable("name")String name){

        System.out.println("请求过来了");
        return new Car(name,id,prive,new Date());

    }


    @RequestMapping("/getCarByBody")
    public Car getCarByBody(Car car){

        return car;
    }

    @InitBinder
    private void initBinder(WebDataBinder webDataBinder){

        webDataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
    }
}
