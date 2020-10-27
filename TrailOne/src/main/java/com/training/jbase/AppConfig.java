package com.training.jbase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.training.autowiring.Rectangle;
import com.training.autowiring.Shape;
import com.training.autowiring.ShapeFactory;
import com.training.autowiring.Traingle;

@Configuration
public class AppConfig {
	@Bean
	public Shape getTraingle() {
		return new Traingle();
	}
	@Bean
	public Vehicle getVehicle() {
		return new Vehicle();
	}
	@Bean
	@Primary
	public Shape getRectangle() {
		return new Rectangle();
	}
	@Bean
	public ShapeFactory getFactory() {
		return new ShapeFactory();
	}


}
