package com.vcube.app02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		Customer obj = (Customer) context.getBean("c1");
		System.out.println(obj.getCid());
		System.out.println(obj.getCname());

	}
}
