package com.example.carservice.controller;

import com.example.carservice.annotation.AnnotationClass;
import com.example.carservice.entity.CarEntity;
import com.example.carservice.service.CarService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;


@RequestMapping
//@RequestMapping("/cars")
public class CarController {

    private CarService carService;

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping("/")
    public String startPage(){
        return "working.. "+instanceId ;
    }



    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/all")
    public Iterable <CarEntity> getAll(){
        return carService.findAll();
    }

    @GetMapping
    public Optional<CarEntity>getById(@RequestParam Integer id){
        return carService.findById(id);
    }

    @DeleteMapping
    public void deleteBy(@RequestParam Integer id){
        carService.deletyById(id);
    }

    @PostMapping
    @AnnotationClass
    public CarEntity addCar(@RequestBody CarEntity carEntity){
        return carService.save(carEntity);
    }

    @PutMapping
    public CarEntity editCar(@RequestBody CarEntity carEntity){
        return carService.save(carEntity);
    }

}
