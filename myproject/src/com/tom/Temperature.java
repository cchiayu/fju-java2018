package com.tom;

import java.util.Scanner;

public class Temperature {
	
	

	public static void main(String[] args) {
		System.out.println("Please enter temperature(celsius)");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		Temperature temp = new Temperature(c);
	}
		
		public double fahrenheit(){
			double f = celsius * (9.0/5) +32;
			return f;
			
			
		}
			
	
	           
		
	private double celsius;
	
	public Temperature(double c){
		double celsius = c;
		this.celsius = celsius;
		
	}
	
	
}
