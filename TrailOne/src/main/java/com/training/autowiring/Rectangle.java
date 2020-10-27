package com.training.autowiring;

import org.springframework.stereotype.Component;

//@Component
public class Rectangle implements Shape {
	@Override
	
	public void calculateArea(int a,int b) {
		System.out.println("rect::"+ a*b);
		
	}

}
