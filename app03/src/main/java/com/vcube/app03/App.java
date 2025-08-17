package com.vcube.app03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Employee sb1 = context.getBean("emp", Employee.class);
        Employee sb2 = context.getBean("emp", Employee.class);
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println("Singleton beans are the same instance: " + (sb1 == sb2)); // true

        
        Employee b1 = context.getBean("emp1", Employee.class);
        Employee b2 = context.getBean("emp1", Employee.class);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("prototype beans are not same instance: " + (b1 == b2)); //false

		
//		ApplicationContext context = new ClassPathXmlApplicationContext("/beans.xml");
//		Employee emp = (Employee)context.getBean("emp",Employee.class);
//		emp.show();
//		System.out.println(emp);
//		Employee emp1 = (Employee)context.getBean("emp1", Employee.class);
//		emp1.show();
//		System.out.println(emp1);
//		
//		Employee emp2 = (Employee)context.getBean("emp2", Employee.class);
//		emp2.show();s
//		
//		System.out.println(emp == emp1);
		
	}
}
