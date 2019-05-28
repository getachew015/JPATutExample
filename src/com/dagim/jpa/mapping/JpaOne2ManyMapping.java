package com.dagim.jpa.mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.dagim.jpa.client.JpaUtility;
import com.dagim.jpa.entity.Library;
import com.dagim.jpa.entity.Student;

public class JpaOne2ManyMapping {

	public static void main(String[] args) {

		Student stud1 = new Student("Dagim Getachew");
		Student stud2 = new Student("Micheal Blunt");
		List<Library> books = new ArrayList<Library>();
		List<Library> books2 = new ArrayList<Library>();
		Library book1 = new Library("ISBN23411123", "Introduction to MicroServices");
		Library book2 = new Library("ISBN87690124", "Linux Operating System");
		Library book3 = new Library("ISBN10091128", "Introduction to Aero dynamics");
		books.add(book2);
		books.add(book1);
		books2.add(book1);
		books2.add(book3);
		stud1.setBooksLibrary(books);
		stud2.setBooksLibrary(books2);
		EntityManager em = JpaUtility.getEntitymanger();
		em.getTransaction().begin();
		em.persist(stud1);
		em.persist(stud2);
		em.persist(book1);
		em.persist(book2);
		em.persist(book3);
		em.getTransaction().commit();
		Student studRec = em.find(Student.class, 2);
		List<Library> bks = studRec.getBooksLibrary();
		bks.forEach(bk -> System.out.println(studRec.getStudentName() + " - "+ 
					bk.toString()));
		
		em.close();
		
		
	}

}
