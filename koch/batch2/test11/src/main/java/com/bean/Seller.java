package com.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Seller")
public class Seller {

    @Id
    // @Column(name = "seller_id")
   //@GeneratedValue
    private String sellerId;

    // @Column(name = "seller_name")
    private String sellerName;

    // @Column(name = "seller_contact_number")
    private String sellerContactNumber;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
	@JsonIgnoreProperties("seller")
	private List<Car> carList = new ArrayList<>();


	public String getSellerId() {
		return sellerId;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerContactNumber() {
		return sellerContactNumber;
	}

	public void setSellerContactNumber(String sellerContactNumber) {
		this.sellerContactNumber = sellerContactNumber;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
//
//	@Override
//	public String toString() {
//		return "Seller{" +
//				"sellerId='" + sellerId + '\'' +
//				", sellerName='" + sellerName + '\'' +
//				", sellerContactNumber='" + sellerContactNumber + '\'' +
//				", carList=" + carList +
//				'}';
//	}


	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Seller seller = (Seller) o;
		return Objects.equals(sellerId, seller.sellerId) && Objects.equals(sellerName, seller.sellerName) && Objects.equals(sellerContactNumber, seller.sellerContactNumber) && Objects.equals(carList, seller.carList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sellerId, sellerName, sellerContactNumber, carList);
	}
}
