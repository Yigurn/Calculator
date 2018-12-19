package com.cognizant.Calculator;

import java.util.Scanner;

public class Calculator {
	Scanner scan;

	public static void main(String[] args) {
		Calulator calc = new Calculator();
	}

	public String scan()
	{
		scan = new Scanner(System.in);
		String input = scan.next();
		return input;
	}
	
	public void runCalc() {
		System.out.print("Please enter a first number: ");
		int int1 = Integer.parseInt(scan());
		
		System.out.print("\r\nPlease enter an operation: ");
		char operation = scan().charAt(0);
		
		System.out.print("\r\nPlease enter a second number: ");
		int int2 = Integer.parseInt(scan());
		
		switch(operation) {
		case '+':
			Addition add = new Addition(int1, int2);
			System.out.println(add);
			break;
		case '-':
			Subtraction sub = new Subtraction();
			System.out.println(sub.subtraction(int1, int2));
			break;
		case '/':
			Division div = new Division(int1, int2);
			System.out.println(div);
			break;
		case '*':
			Multiplication mul = new Multiplication();
			System.out.println(mul.multiply(int1, int2));
			break;
		
		}
	}
}
