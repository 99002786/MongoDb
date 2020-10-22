package com.lts.jbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Vehicle {
	String VehicleName;
	Integer vehicleId;
	String Brand;
	public String getVehicleName() {
		return VehicleName;
	}
	@Value("Dezire")
	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}
	public Integer getVehicleId() {
		return vehicleId;
	}
	@Value("20")
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getBrand() {
		return Brand;
	}
	@Value("Honda")
	public void setBrand(String brand) {
		Brand = brand;
	}
	@Override
	public String toString() {
		return "Vehicle [VehicleName=" + VehicleName + ", vehicleId=" + vehicleId + ", Brand=" + Brand + "]";
	}

}
