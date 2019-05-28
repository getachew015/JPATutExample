package com.dagim.jpa.mapping;

import javax.persistence.EntityManager;

import com.dagim.jpa.client.JpaUtility;
import com.dagim.jpa.entity.Course;
import com.dagim.jpa.entity.Student;
import com.dagim.jpa.entity.StudentRegistered;

public class JpaMany2OneMapping {

	public static void main(String[] args) {

		Course course  = new Course("CS204", "Introduction to OS");
		StudentRegistered stud1 = new StudentRegistered("ST1121","David Corona");
		StudentRegistered stud2 = new StudentRegistered("ST2312","Belay Zeleke");
		//Here stud1 is taking both CS204 and CS301
		stud1.setCourse(course);
		stud2.setCourse(course);
		EntityManager em = JpaUtility.getEntitymanger();
		em.getTransaction().begin();
		em.persist(course);
		em.persist(stud1);
		em.persist(stud2);
		em.getTransaction().commit();
		em.close();
		
	}

}
