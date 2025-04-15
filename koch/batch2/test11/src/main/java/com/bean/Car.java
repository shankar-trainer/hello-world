package com.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Car")
public class Car {

    @Id
    // @Column(name = "reg_number")
    //@GeneratedValue
    private String regNumber;

    // @Column(name = "car_name")
    private String carName;

    // @Column(name = "car_manufacturer")
    private String carManufacturer;

    // @Column(name = "car_model")
    private String carModel;

    // @Column(name = "car_registration_date")
    private String carRegistrationDate;

    // @Column(name = "car_price")
    private double carPrice;

    @ManyToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnoreProperties("carList")
    @JoinColumn(name = "sellerid", nullable = false)
    private Seller seller;

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarManufacturer() {
		return carManufacturer;
	}

	public void setCarManufacturer(String carManufacturer) {
		this.carManufacturer = carManufacturer;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarRegistrationDate() {
		return carRegistrationDate;
	}

	public void setCarRegistrationDate(String carRegistrationDate) {
		this.carRegistrationDate = carRegistrationDate;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

//	@Override
//	public String toString() {
//		return "Car{" +
//				"regNumber='" + regNumber + '\'' +
//				", carName='" + carName + '\'' +
//				", carManufacturer='" + carManufacturer + '\'' +
//				", carModel='" + carModel + '\'' +
//				", carRegistrationDate='" + carRegistrationDate + '\'' +
//				", carPrice=" + carPrice +
//				'}';
//	}


	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return Double.compare(carPrice, car.carPrice) == 0 && Objects.equals(regNumber, car.regNumber) && Objects.equals(carName, car.carName) && Objects.equals(carManufacturer, car.carManufacturer) && Objects.equals(carModel, car.carModel) && Objects.equals(carRegistrationDate, car.carRegistrationDate) && Objects.equals(seller, car.seller);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regNumber, carName, carManufacturer, carModel, carRegistrationDate, carPrice, seller);
	}
}
