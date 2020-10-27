package com.training.mileage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleDetails {
	 @Autowired
	 @Qualifier("bike")
	MileCalculator bike;
	@Autowired
	@Qualifier("car")
	MileCalculator car;
	
	public void getMileage(String choice)
	{
		if(choice.equals("bike"))
			bike.showMileage();
		else
			car.showMileage();
	}

	
}