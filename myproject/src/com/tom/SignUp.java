package com.tom;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(("Are you 18 ? (y/N)"));
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		System.out.println("*"+line+"*");
		boolean adult = line.toUpperCase().equals("y");
		System.out.println("adult");
		if (adult){
		System.out.print("your age?");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("your name?");
		String name = scanner.nextLine(); 
		System.out.print("your nickName?");
		String nickName = scanner.nextLine();
		System.out.println(age+"/"+name+"/"+nickName);
		
			} else {
					System.out.println("XXX,bye");
		}
	}
	}
