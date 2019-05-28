package com.dagim.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id
	private String courseId;
	private String courseTitle;
	
	public Course(){
		
	}
	public Course(String courseId, String courseTitle) {
		super();
		this.courseId = courseId;
		this.courseTitle = courseTitle;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle + "]";
	}
	
}
