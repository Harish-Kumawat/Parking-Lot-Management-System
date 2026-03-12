package com.vms.service;

import java.util.Scanner;

import com.vms.model.ParkingSpace;
import com.vms.model.Vehicle;

public class ParkingServiceImpl implements ParkingInterface {

	private Vehicle[] parkingSpaces = new Vehicle[ParkingSpace.MAX_PARKING_SPACE];

	Scanner sc = new Scanner(System.in);

	@Override
	public void addVehicles() {

		System.out.println("-- Enter no. of vehicles user wants to park: --");
		int n = sc.nextInt();

		if (n <= ParkingSpace.MAX_PARKING_SPACE) {

			for (int i = 0; i < n; i++) {

				Vehicle v = new Vehicle();

				System.out.println("-- Enter vehicle no: --");
				String vno = sc.next();
				v.setVehiclenumber(vno);

				System.out.println("-- Enter owner name: --");
				String ownername = sc.next();
				v.setOwnername(ownername);

				System.out.println("-- Enter vehicle type: --");
				String vtype = sc.next();
				v.setVehicletype(vtype);

				parkingSpaces[i] = v;

				System.out.println("");
				System.out.println("Vehicle parked at position " + (i + 1));
				System.out.println("");
			}

		} else {

			System.out.println("Parking space exceeded. Max capacity is " + ParkingSpace.MAX_PARKING_SPACE);
		}

	}

	@Override
	public void displayAllParkedVehicles() {

		System.out.println("");
		System.out.println("All parked vehicle details:");
		System.out.println("");

		for (Vehicle vehicle : parkingSpaces) {

			if (vehicle != null) {

				System.out.println(vehicle);
			}
		}
	}

	@Override
	public void searchVehicleByVehicleNumber() {

		System.out.println("Enter vehicle No:");
		String vehicleNo = sc.next();

		for (Vehicle vehicle : parkingSpaces) {

			if (vehicle != null && vehicle.getVehiclenumber().equals(vehicleNo)) {

				System.out.println(vehicle);
			}
		}

	}

	@Override
	public void countVehiclesByItsType() {

		int bike = 0;
		int car = 0;
		int truck = 0;

		for (Vehicle vehicle : parkingSpaces) {

			if (vehicle != null) {

				if (vehicle.getVehicletype().equalsIgnoreCase("bike")) {

					bike++;
				}

				else if (vehicle.getVehicletype().equalsIgnoreCase("car")) {

					car++;
				} else if (vehicle.getVehicletype().equalsIgnoreCase("truck")) {
					truck++;
				}

			}
		}
		System.out.println("");
		System.out.println("Total Bikes : " + bike);
		System.out.println("Total Cars  : " + car);
		System.out.println("Total Trucks: " + truck);
	}

}
