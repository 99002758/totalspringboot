package com.training.mileage;

import org.springframework.stereotype.Component;

@Component
public class Bike implements MileCalculator {

	@Override
	public void showMileage() {
		System.out.println("mileage is :" + "30kmph");

	}

}
