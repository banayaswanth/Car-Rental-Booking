package com.casestudy.carmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.carmanagement.entities.Car;
import com.casestudy.carmanagement.repositories.CarRepository;


@RestController
public class CarController {
	
	@Autowired
	private CarRepository carRepo;
	
	@GetMapping("/test")
	public String test(){
		return "Testing";
	}
	
	@PostMapping("/addCar")
	public Car addCar(@RequestBody Car car) {
		return carRepo.save(car);
	}
	
	@GetMapping("/getCarById/{id}")
	public Car getCarById(@PathVariable Long id) {
		return carRepo.findById(id).get();
	}
	
	@GetMapping("/getAllCars")
	public List<Car> getAllCars() {
		return carRepo.findAll();
	}

}
