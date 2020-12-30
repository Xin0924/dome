package com.example.demo.controller;

import com.example.po.Car;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    @RequestMapping("/findone")
    public Car findOne(){
        Car car = new Car(1, "bm", 300000F, new Date());
        return car;
    }
    @RequestMapping("/getall")
    public List<Car> getAll(){
        List<Car> list=new ArrayList<>();
        Car car1 = new Car(1, "bm", 320000F, new Date());
        Car car2 = new Car(2, "bc", 350000F, new Date());
        Car car3 = new Car(3, "ad", 290000F, new Date());
        Car car4 = new Car(4, "bsj", 3000000F, new Date());
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        return list;
    }
}
