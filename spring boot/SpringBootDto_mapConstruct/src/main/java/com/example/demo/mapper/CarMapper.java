package com.example.demo.mapper;

import com.example.demo.dto.CarDto;
import com.example.demo.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CarMapper {

    // Define custom mappings for fields with different names
    @Mapping(source = "make", target = "brand")
    @Mapping(source = "numberOfSeats", target = "seatCount")
    @Mapping(source = "type", target = "vehicleType")
    CarDto carToCarDto(Car car);

    @Mapping(source = "brand", target = "make")
    @Mapping(source = "seatCount", target = "numberOfSeats")
    @Mapping(source = "vehicleType", target = "type")
    Car carDtoToCar(CarDto carDto);
}
