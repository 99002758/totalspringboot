package com.hotelapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	
	HotelService hotelservice;
	@GetMapping("/hotel")
	public List<Hotel> showAllHotels(){
		return hotelservice.getAllHotels();
	}
	@GetMapping("/hotel-by-city/{city}")
	public List<Hotel> getByCity(@PathVariable("city")String city){
		return hotelservice.getByCity(city);
	}
	@GetMapping("/hotel-by-cuisine/{cuisine}")
	public List<Hotel> getByCuisine(@PathVariable("cuisine")String cuisine){
		return hotelservice.getByCuisine(cuisine);
	}
}
