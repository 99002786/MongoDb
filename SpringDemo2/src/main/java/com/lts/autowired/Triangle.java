package com.lts.autowired;

import org.springframework.stereotype.Component;

/*@Component*/
public class Triangle implements Shape{

	@Override
	public void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("tri "+1/2*x*y);
		
	}

}
