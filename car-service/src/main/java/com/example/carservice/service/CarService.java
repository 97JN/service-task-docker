package com.example.carservice.service;

import com.example.carservice.entity.CarEntity;
import com.example.carservice.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;


    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Iterable<CarEntity> findAll() {
        return carRepository.findAll();
    }

    public Optional<CarEntity> findById(Integer temp) {
        return carRepository.findById(temp);
    }

    public void deletyById(Integer temp) {
        carRepository.deleteById(temp);
    }

    public CarEntity save(CarEntity carEntity) {
        return carRepository.save(carEntity);
    }
}
