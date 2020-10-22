package com.lts.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
	String name;
	Integer empid;
	String dept;
	@Autowired
	Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	@Value("${employee.name}")
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmpid() {
		return empid;
	}
	@Value("${employee.empid}")
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getDept() {
		return dept;
	}
	@Value("${employee.dept}")
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", dept=" + dept + ", address=" + address + "]";
	}

}
