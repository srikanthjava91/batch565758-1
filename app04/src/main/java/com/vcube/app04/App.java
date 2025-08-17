package com.vcube.app04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new AnnotationConfigApplicationContext(MobileConfig.class);
		Mobile m = (Mobile) context.getBean("mob");
		m.show();
	}
}
