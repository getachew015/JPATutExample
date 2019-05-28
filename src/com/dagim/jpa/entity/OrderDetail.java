package com.dagim.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OrderDetail {
	
	@Id
	private String orderId;
	private int customerId;
	private String storeId;
	private String counterId;
	@OneToOne
	private Order order;
	
	public OrderDetail(){
		
	}

	public OrderDetail(String orderId, int customerId, String storeId, String counterId, Order order) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.storeId = storeId;
		this.counterId = counterId;
		this.order = order;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getCounterId() {
		return counterId;
	}
	public void setCounterId(String counterId) {
		this.counterId = counterId;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
