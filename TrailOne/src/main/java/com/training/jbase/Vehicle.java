package com.training.jbase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Vehicle {
       String vehiclename;
       int vehicleId;
       String brand;
	public String getVehiclename() {
		return vehiclename;
	}
	@Value("dzire")
	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	@Value("101")
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getBrand() {
		return brand;
	}
	@Value("swift")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Vehicle [vehiclename=" + vehiclename + ", vehicleId=" + vehicleId + ", brand=" + brand + "]";
	}
}
