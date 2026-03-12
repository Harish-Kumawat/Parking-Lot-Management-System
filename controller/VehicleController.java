package com.vms.controller;

import java.util.Scanner;

import com.vms.service.ParkingInterface;
import com.vms.service.ParkingServiceImpl;

public class VehicleController {

	public static void main(String[] args) {

		System.out.println("  VEHICLE PARKING MANAGEMENT SYSTEM ");

		boolean flag = true;

		Scanner sc = new Scanner(System.in);

		ParkingInterface pi = new ParkingServiceImpl();

		while (flag) {

			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
			System.out.println("--> 1: Add a Vehicle");
			System.out.println("--> 2: Display All Parked Vehicles");
			System.out.println("--> 3: Search For a Vehicle By Vehicle No.");
			System.out.println("--> 4: Count Vehicles By Type");
			System.out.println("--> 5: Exit Application");
			System.out.println("");

			System.out.println("Enter Your Choice:");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				pi.addVehicles();
				break;

			case 2:
				pi.displayAllParkedVehicles();
				break;

			case 3:
				pi.searchVehicleByVehicleNumber();
				break;

			case 4:
				pi.countVehiclesByItsType();
				break;

			case 5:
				flag = false;
				System.out.println("Application Closed !!");
				break;

			default:
				System.out.println("Wrong Choice");
			}
		}sc.close();
	}
}