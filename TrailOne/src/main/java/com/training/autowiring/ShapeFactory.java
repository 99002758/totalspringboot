package com.training.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//@Component
public class ShapeFactory {
        @Autowired
        @Qualifier("getTraingle")
      Shape shape;
	public void printArea(int a,int b) {
		
		shape.calculateArea(a,b);
		
	}

}
