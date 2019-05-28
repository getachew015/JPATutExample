package com.dagim.jpa.client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.dagim.jpa.entity.Address;
import com.dagim.jpa.entity.CustomerDetails;

public class JpaCollectionsMapping {

	public static void main(String[] args) {
		insertRecords();
		getRecords();
		

	}
	
	public static void getRecords(){
		
		EntityManager em = JpaUtility.getEntitymanger();
		CustomerDetails customer = em.find(CustomerDetails.class, 1);
		List<Address> address = customer.getAddress();
		System.out.println(customer.toString());
		for (Address adr : address) {
			System.out.println(adr.toString());
		}
	}
	
	public static void insertRecords(){
		EntityManager em = JpaUtility.getEntitymanger();
		
		em.getTransaction().begin();
		
		List<Address> address1 = new ArrayList<Address>();
		Address adr1 = new Address("1501 Hawthorne","Minneapolis", "55403");
		Address adr2 = new Address("1208 Case Ave","Saint Paul", "55223");
		Address adr3 = new Address("203 Rose Garden Ln","Bentonville", "72712");
		address1.add(adr1);
		address1.add(adr2);

		List<Address> address2 = new ArrayList<Address>();
		address2.add(adr3);		
		CustomerDetails customer1 = new CustomerDetails("Mathew Braymon","2001-08-15",address1,"534-233-9889");
		CustomerDetails customer2 = new CustomerDetails("Deavon Manccini","1996-08-15",address2,"703-673-5443");
		
		em.persist(customer1);
		em.persist(customer2);
		em.getTransaction().commit();
		
		em.close();
		

	}
}
