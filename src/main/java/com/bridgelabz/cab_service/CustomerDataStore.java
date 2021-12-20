package com.bridgelabz.cab_service;

import java.util.ArrayList;
import java.util.List;

public class CustomerDataStore {
	public static CustomerDataStore instance;
	private List<CustomerData> customerDataList = new ArrayList<>();

	private CustomerDataStore() {

	}

	public static CustomerDataStore getInstance() {
		if (instance == null) {
			instance = new CustomerDataStore();
		}
		return instance;
	}

	public void add(CustomerData customer) {
		customerDataList.add(customer);
	}

	public List<CustomerData> getList() {
		return customerDataList;
	}

}
