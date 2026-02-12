package com.example.demo.service;

import com.example.demo.dto.CarDto;
import com.example.demo.entity.Car;
import com.example.demo.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarMapper carMapper;

    @Autowired // Constructor injection is preferred
    public CarService(CarMapper carMapper) {
        this.carMapper = carMapper;
    }

    public CarDto getCarDtoDetails(Car car) {
        // Map the entity to the DTO
        CarDto carDto = carMapper.carToCarDto(car);
        // Additional business logic
        return carDto;
    }

    public Car saveCar(CarDto carDto) {
        // Map the DTO to the entity
        Car carEntity = carMapper.carDtoToCar(carDto);
        // Save the entity to the database (e.g., using a repository)
        // carRepository.save(carEntity);
        return carEntity;
    }
}
