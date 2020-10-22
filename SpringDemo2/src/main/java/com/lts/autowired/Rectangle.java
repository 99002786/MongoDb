package com.lts.autowired;

import org.springframework.stereotype.Component;

//@Component
public class Rectangle implements Shape {

	public void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("rect "+x*y);
		
	}

}
