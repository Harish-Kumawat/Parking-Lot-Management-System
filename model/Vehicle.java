package com.vms.model;

public class Vehicle {

	private String vehiclenumber;
	private String ownername;
	private String vehicletype;

	public String getVehiclenumber() {
		return vehiclenumber;
	}

	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public String getVehicletype() {
		return vehicletype;
	}

	public void setVehicletype(String vehicletype) {
		this.vehicletype = vehicletype;
	}

	@Override
	public String toString() {
		return "Vehicle Number : " + vehiclenumber  + 
				"\nOwner Name  : " + ownername +
				"\nVehicle Type: " + vehicletype +"\n";
	
	}
}
