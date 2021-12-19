package com.bridgelabz.cab_service;

import java.util.Arrays;
import java.util.Scanner;

public class CabService {

	public double calculatePerRideFare() {
		CustomerData customer = CustomerData.getInstance();
		bookCab();
		customer.setTotalFare(customer.getTotalFare() + ((customer.getDistance() * 10) + customer.getTime()));
		if (customer.getTotalFare() < 5) {
			customer.setTotalFare(5);
		}
		System.out.println();
		System.out.println("Customer Name: " + customer.getName() + " \nTotal Fare is: Rs." + customer.getTotalFare());
		return customer.getTotalFare();
	}

	public void bookCab() {
		CustomerData customer = CustomerData.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("Distance: ");
		int distance = sc.nextInt();
		customer.setDistance(distance);
		System.out.print("Time: ");
		int time = sc.nextInt();
		customer.setTime(time);
		}

	public double MultipleRide() {
		CustomerData customer = CustomerData.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Data");
		System.out.print("Name: ");
		String name = sc.next();
		customer.setName(name);
		int ride =1;
		do {
		if (ride == 1) {
			calculatePerRideFare();
		}
		System.out.println("Ride \n1.yes\n2.no");
		ride = sc.nextInt();
		
		}while(ride==1);
		System.out.println("Total fare:" + customer.getTotalFare());
		return customer.getTotalFare();

	}

}
