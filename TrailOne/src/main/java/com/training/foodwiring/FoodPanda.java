package com.training.foodwiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class FoodPanda {
	@Autowired
	@Qualifier("indian")
	Menu imenu;
	@Autowired
	@Qualifier("chinese")
	Menu cmenu;
	public void itemsAvailable(String choice) {
		if (choice.equals("chinese")) 
			System.out.println(cmenu.itemsAvailable());
		else
			System.out.println(cmenu.itemsAvailable());
			
		}
	}
	


