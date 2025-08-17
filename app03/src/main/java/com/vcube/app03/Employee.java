package com.vcube.app03;

public class Employee {
	int empid;
	String empName;
	int age;

	public Employee() {
		System.out.println("No arg constructor called ");
	}

	public Employee(int empid, String empName, int age) {
		System.out.println("3-parameterized constructor called ");
		this.empid = empid;
		this.empName = empName;
		this.age = age;
	}

	public Employee(String empName, int age) {
		System.out.println("2-parameterized constructor called ");
		this.empName = empName;
		this.age = age;
	}
	
	public Employee(int age) {
		System.out.println("1-parameterized constructor called ");
		this.age = age;
	}
	
	
	
	public Employee(String empName) {
		System.out.println("1-parameterized constructor called ");
		this.empName = empName;
	}

	void show() {
		System.out.println("****************************");
		System.out.println("emp ID : " + empid);
		System.out.println("emp Name : " + empName);
		System.out.println("emp Age : " + age);
	}

}
