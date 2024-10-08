package com.app.dto;

import java.util.ArrayList;
import java.util.List;

import com.app.entity.Orders;

public class OrderResponseDto extends CommonApiResponse {

	private List<Orders> orders = new ArrayList<>();

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

}
