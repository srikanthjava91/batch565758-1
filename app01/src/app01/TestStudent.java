package app01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {

		ApplicationContext contxt = new ClassPathXmlApplicationContext("/beans.xml");
		Student st = (Student) contxt.getBean("st");
		System.out.println(st.getSid());
		System.out.println(st.getMessage());
	}

}
