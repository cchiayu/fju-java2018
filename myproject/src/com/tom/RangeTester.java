package com.tom;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(("please enter a int beteew -3 and 5"));
		Scanner scanner = new Scanner(System.in);
		int line = scanner.nextInt();
	    
		System.out.println("*"+line+"*");
		System.out.println(-3 <= line && line<=5);
	
		
//		boolean num = line.equals((line.equals("-3")||line.equals("-2")||line.equals("-1")||line.equals("0")||line.equals("1")||line.equals("2") ||line.equals("3")||line.equals("4")||line.equals("5")));
		
	}

} 
