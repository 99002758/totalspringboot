package com.training.autowiring;

import org.springframework.stereotype.Component;



//@Component
public class Traingle implements Shape {

 

    @Override
    public void calculateArea(int a, int b) {
        // TODO Auto-generated method stub
        System.out.println("Area of triangle is");
        System.out.println(0.5*a*b);
    }

 }
