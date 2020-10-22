package com.lts.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	String name;
	Integer stid;
	String dept;
	Course course;
	public String getName() {
		return name;
	}
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStid() {
		return stid;
	}
	@Value("${student.stid}")
	public void setStid(Integer stid) {
		this.stid = stid;
	}
	public String getDept() {
		return dept;
	}
	@Value("${student.dept}")
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", stid=" + stid + ", dept=" + dept + ", course=" + course + "]";
	}
	public Student(Course course) {
		super();
		this.course = course;
	}
	

}
