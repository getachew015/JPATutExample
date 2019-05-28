package com.dagim.jpa.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	private String studentName;
	@OneToMany(targetEntity = Library.class)
	private List<Library> booksLibrary;
	@ManyToOne
	private Course course;
	
	public Student(){
		
	}
	
	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}

	public Student(int studentId, String studentName, List<Library> booksLibrary) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.booksLibrary = booksLibrary;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Library> getBooksLibrary() {
		return booksLibrary;
	}

	public void setBooksLibrary(List<Library> booksLibrary) {
		this.booksLibrary = booksLibrary;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", booksLibrary=" + booksLibrary
				+ "]";
	}
	
	

}
