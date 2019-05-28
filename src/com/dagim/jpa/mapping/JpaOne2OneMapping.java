package com.dagim.jpa.mapping;

import javax.persistence.EntityManager;

import com.dagim.jpa.client.JpaUtility;
import com.dagim.jpa.entity.Order;
import com.dagim.jpa.entity.OrderDetail;

public class JpaOne2OneMapping {

	public static void main(String[] args) {
		insertRecords();

	}
	
	public static void insertRecords(){
		
		Order order = new Order("ASD3001","XN3001","Jordan Shoe","5");
		OrderDetail orderDetail = new OrderDetail("ASD3001",1900,"STO2331","CTR31",order);
		Order order1 = new Order("ASD3002","XN3002","Jordan Jogger","2");
		OrderDetail orderDetail1 = new OrderDetail("ASD3002",1901,"STO2331","CTR32",order1);
		EntityManager em = JpaUtility.getEntitymanger();
		
		em.getTransaction().begin();
		em.persist(order);
		em.persist(order1);
		em.persist(orderDetail);
		em.persist(orderDetail1);
		em.getTransaction().commit();
		
	}

}
