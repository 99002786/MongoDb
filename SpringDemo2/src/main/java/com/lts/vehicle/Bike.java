package com.lts.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Bike implements  MileCalculator{
	@Override
	public void showMileage() {
		System.out.println("Bike Mileage is: ");
	}
	

}
