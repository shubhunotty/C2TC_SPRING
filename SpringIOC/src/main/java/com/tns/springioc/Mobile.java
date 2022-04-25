package com.tns.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config loaded");
		
////		Airtel a = (Airtel)c.getBean("airtel");
//		Airtel a = c.getBean("airtel",Airtel.class);
//		a.calling();
//		a.data();
//		
//		
////		Jio j = (Jio)c.getBean("jio");
//		Jio j = c.getBean("jio",Jio.class);
//		j.calling();
//		j.data();
		
		Sim s = c.getBean("sim",Sim.class); 
		s.calling();
		s.data();

	}

}
