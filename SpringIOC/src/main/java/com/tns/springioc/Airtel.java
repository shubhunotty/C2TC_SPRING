package com.tns.springioc;

public class Airtel implements Sim {
	
	public Airtel() {
		System.out.println("Airtel constructor is called");
	}

	public void calling() {
		System.out.println("Calling using Airtel");
		
	}

	public void data() {
		System.out.println("Browsing using Airtel");
		
	}

}
