package com.training.mileage;

import org.springframework.stereotype.Component;

@Component
public class Car implements MileCalculator {
	@Override
	public void showMileage() {
		System.out.println("mileage is ...50kmph");

	}

}
