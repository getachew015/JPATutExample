package com.dagim.jpa.client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.dagim.jpa.entity.UserDetails;

public class JPAOperations {

	public static void main(String[] args) {
		//1)Find Records
		List<Integer> userIds = new ArrayList<Integer>();
		userIds.add(1001);
		userIds.add(1002);
		userIds.add(1003);
		userIds.add(1004);
		findRecords(userIds);
		//2)Delete Records to avoid duplicate
		deleteRecords(1001);
		deleteRecords(1002);
		deleteRecords(1003);
		deleteRecords(1004);
		//3)insert records
		insertRecords();
		//4)update Records
		updateRecords(1001,"Odowuye Nukurmu");
	}
	
	public static void insertRecords(){

		UserDetails user1 = new UserDetails(1001,"Mariyah Butina");
		UserDetails user2 = new UserDetails(1002,"George Clooney");
		UserDetails user3 = new UserDetails(1003,"Pablo Escobar");
		UserDetails user4 = new UserDetails(1004,"Rico Rodrigo");
		EntityManager em = JpaUtility.getEntitymanger();
		em.getTransaction().begin();
		em.persist(user1);
		em.persist(user2);
		em.persist(user3);
		em.persist(user4);
		em.getTransaction().commit();
		em.close();
		
	}
	public static void deleteRecords(){
		
	}
	public static void findRecords(List<Integer> userIdList){

		List<UserDetails> users = new ArrayList<UserDetails>();
		EntityManager em = JpaUtility.getEntitymanger();
		userIdList.forEach(id -> users.add(em.find(UserDetails.class, id)));
		users.forEach(user -> System.out.println(user.toString()));

	}

	public static void updateRecords(int id, String name){
		EntityManager em = JpaUtility.getEntitymanger();
		UserDetails user = em.find(UserDetails.class, id);
		em.getTransaction().begin();
		user.setUserName(name);
		em.getTransaction().commit();
		em.close();
		
		
	}

	public static void deleteRecords(int id){
		
		EntityManager em = JpaUtility.getEntitymanger();
		UserDetails user = em.find(UserDetails.class, id);
		em.getTransaction().begin();
		em.remove(user);
		em.getTransaction().commit();
		em.close();
		
	}
}
