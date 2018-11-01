package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int secret = random.nextInt(100)+1;
		System.out.println(secret);
		System.out.println("please enter a number from 1 to 100");
		int min = 1;
		int max = 100;
		int guess = scanner.nextInt();
		while (secret!=guess ) {
			if (guess>secret&&guess<=100) {
				max = guess;
			}else {
				min = guess;
			}
			System.out.printf(min+"to"+ max,"please enter number:");
			guess = scanner.nextInt();//guess again
		}
		
		System.out.println("®¥³ßµª¹ï¤F!!");
		
		
		int a = 1;
		while (a>0){
		System.out.println("yayayay");
		a = a - 1;
		}
		
	}
}
