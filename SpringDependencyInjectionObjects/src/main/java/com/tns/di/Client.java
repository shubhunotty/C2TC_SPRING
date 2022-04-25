package com.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
//		Student s1 = new Student();
//		s1.cheating();
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		
		Student s1 = c.getBean("s1",Student.class);
		s1.cheating();
		
		AnotherStudent s2 = c.getBean("s2",AnotherStudent.class);
		s1.cheating();

	}

}
