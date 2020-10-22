package com.lts.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCalculator{
	
	public void showMileage() {
		System.out.println("Car Mileage is: ");
	}

}
