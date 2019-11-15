package com.offcn.springbootdemo.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String name;

    private Integer id;

    private Double prive;

    private Date createDate;




}
