package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.training.autowiring.Shape;
import com.training.autowiring.ShapeFactory;
import com.training.jbase.Vehicle;
import com.training.setter.Employee;

@SpringBootApplication
public class MileageApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MileageApplication.class, args);
		
	}
	@Autowired
	ApplicationContext context;
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Employee employee1 = context.getBean("employee", Employee.class);
		 * System.out.println("emp 1"+employee1);
		 * 
		 * Employee employee2 = context.getBean("employee", Employee.class);
		 * System.out.println("emp 2"+employee2);
		 * 
		 * employee2.setName("Kumaran"); System.out.println("emp 1"+employee1);
		 * System.out.println("emp 2"+employee2);
		 */
		// TODO Auto-generated method stub
//		VehicleDetails vd=context.getBean(VehicleDetails.class);
//		vd.getMileage("car");
//		FoodPanda obj= context.getBean(FoodPanda.class);
//		obj.itemsAvailable("chinese");
////		
//        Vehicle vehicle = context.getBean("vehicle",Vehicle.class);
//        		System.out.println(vehicle);
//	
		ShapeFactory shapefactory = context.getBean("getFactory",ShapeFactory.class);
		shapefactory.printArea(10,20);
	}

}
 


 
    