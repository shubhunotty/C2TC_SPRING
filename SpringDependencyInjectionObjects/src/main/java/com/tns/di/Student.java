package com.tns.di;

public class Student {
	
	private MathCheat chit;
	
	
	public void setChit(MathCheat chit) {
		this.chit = chit;
	}



	public void cheating() {
		chit.mathcheat();
		
	}

}
