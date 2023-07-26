package com.abc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dao.CarRepository;
import com.abc.exception.CarException;
import com.abc.exception.EmployeeException;
import com.abc.model.Car;
import com.abc.model.Employee;

@Service
public class CarService {

	@Autowired
	private CarRepository dao;

	public Car addCar(Car car) throws EmployeeException {

		Optional<Car> findById = dao.findById(car.getCarId());
		if (!findById.isPresent())
			return dao.save(car);
		else
			throw new EmployeeException("employee already present");
	}

	public Car searchEmployee(int id) throws CarException {
		Optional<Car> findById = dao.findById(id);
		if (findById.isPresent())
			return findById.get();
		else
			throw new CarException("Car not  present");
	}

	public Car updateCar(Car car) throws CarException {
		Optional<Car> findById = dao.findById(car.getCarId());
		if (findById.isPresent()) {
			Car e = findById.get();
			dao.save(e);
			return e;
		} else
			throw new CarException("employee not  found");

	}

	public Car deleteCar(int id) throws CarException {
		Optional<Car> findById = dao.findById(id);
		if (findById.isPresent()) {
			Car car= findById.get();
			dao.delete(findById.get());
			return car;
		} else
			throw new CarException("car not found");
	}

	public List<Car> getAllCars() throws CarException {
		if(dao.findAll().size()==0)
				throw new CarException("car  list is empty");
		else
		return dao.findAll();
	}
}
