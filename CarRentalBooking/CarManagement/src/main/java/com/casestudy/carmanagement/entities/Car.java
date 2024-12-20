package com.casestudy.carmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Car {
	
	@Id
	private Long id;
	private String carModel;
	private String location;
	private Double price;
	private String startDate;
	private String endDate;
	@Lob
	private byte[] image;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	

	
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Car(Long id, String carModel, String location, Double price, String startDate, String endDate, byte[] image) {
		super();
		this.id = id;
		this.carModel = carModel;
		this.location = location;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
		this.image = image;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", carModel=" + carModel + ", location=" + location + ", price=" + price
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", image=" + image + "]";
	}
	
	

}
