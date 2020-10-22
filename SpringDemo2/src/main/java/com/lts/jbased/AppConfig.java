package com.lts.jbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.lts.autowired.Rectangle;
import com.lts.autowired.Shape;
import com.lts.autowired.Triangle;

@Configuration
public class AppConfig {
	@Bean
	public Vehicle getVehicle() {
		return new Vehicle();
	}
	public Shape getTriangle() {
		return new Triangle();
	}
	@Bean
	@Primary
	public Shape getRectangle() {
		return new Rectangle();
	}
}
