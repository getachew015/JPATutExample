package com.dagim.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StudentRegistered {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int regId;
	private String studentId;
	private String studentName;
	@ManyToOne
	private Course course;
	
	public StudentRegistered(){
		
	}

	public StudentRegistered(String studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}


	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudentRegistered [regId=" + regId + ", studentId=" + studentId + ", studentName=" + studentName
				+ ", course=" + course + "]";
	}
	
	
	

}
