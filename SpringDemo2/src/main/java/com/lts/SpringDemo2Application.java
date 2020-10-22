package com.lts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.autowired.ShapeFactory;
import com.lts.constr.Student;
import com.lts.foodwiring.FoodPanda;
import com.lts.jbased.Vehicle;
import com.lts.setter.Employee;
import com.lts.vehicle.VehicleDetails;


@SpringBootApplication
public class SpringDemo2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo2Application.class, args);
	}
	@Autowired
	ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
Employee employee1=context.getBean("employee",Employee.class);
System.out.println("emp 1"+employee1);
Employee employee2=context.getBean("employee",Employee.class);
System.out.println("emp 2"+employee2);
employee2.setName("Kumaran");
System.out.println("emp 1"+employee1);
System.out.println("emp 2"+employee2);
//		Student student=context.getBean(Student.class);
//		System.out.println(student);
		ShapeFactory shapeFactory=context.getBean(ShapeFactory.class);
		shapeFactory.printArea(10, 20);
//		FoodPanda foodPanda=context.getBean(FoodPanda.class);
//		List<String> list=foodPanda.showMenu("indian");
//		for(String item:list)
//			System.out.println(item);
//		VehicleDetails mile = context.getBean(VehicleDetails.class);
//		mile.getMileage("car");
Vehicle vehicle=context.getBean("vehicle",Vehicle.class);
System.out.println(vehicle);
	}

}
