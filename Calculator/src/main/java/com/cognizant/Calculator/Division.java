package com.cognizant.Calculator;

public class Division {

	double value = 0;
	
	public Division(int a, int b) {
		value = a / (double)b;
	}
	
	public double getResult()
	{
		return value;
	}			
}
