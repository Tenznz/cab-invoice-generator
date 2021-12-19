package com.bridgelabz.cab_service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CabServiceTest {

	@Test
	public void given_distance_time_should_return_total_fares() {
		CabService cabService = new CabService();
		CustomerData.getInstance();
		double actualFare = cabService.calculatePerRideFare(); // distance = 10 time = 10, totalFare=(10*10)+10=110
		assertEquals(110, actualFare, 0);
	}

	@Test
	public void given_distance_time_should_return_total_fares_5() {
		CabService cabService = new CabService();
		CustomerData.getInstance();
		double actualFare = cabService.calculatePerRideFare(); // distance = 0 time = 1, totalFare should be 5
		assertEquals(5, actualFare, 0);
	}
}
