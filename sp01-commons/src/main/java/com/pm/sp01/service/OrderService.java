package com.pm.sp01.service;

import com.pm.sp01.pojo.Order;

public interface OrderService {
	
	Order getOrder(String orderId);
	
	void addOrder(Order order);

}
