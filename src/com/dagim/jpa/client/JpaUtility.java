package com.dagim.jpa.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtility {
	
	private static EntityManager entityManger=null;

	public static EntityManager getEntitymanger() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPATutExample");
		entityManger = emf.createEntityManager();
		return entityManger;
	}

}
