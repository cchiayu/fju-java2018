package com.tom;

	import java.util.Random;

	import java.util.Scanner;
	
	public class Exam3rv {

	    /* 第三題  猜數字程式 20分 
			1. 先產生一個介於1到10的亂數，為祕密數字 (假設是7)
			2. 讓使用者猜這個數字，如下:
			Your guess: 5(使用者猜5)
			3. 提示使用者要高一點或低一點，再請他猜下一次，如下:
			higher
			Your guess: 9(使用者猜9)
			lower
			4. 當使用者猜中祕密數字時，印出:
			Great! The secret number is 7
			
			提示: 在while迴圈中可使用break指令跳出迴圈外。
			● 若有利用類別設計完成此題，加倍給分。
			
		    第四題 計算猜幾次 10分
		        承第三題，如果使用者猜二次以內(包括二次)猜對時，請顯示:
		   Excellent! The secret number is 7

	    */
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();
			int secret = random.nextInt(10)+1;
			System.out.println(secret);
			System.out.println("please enter a number from 1 to 10");
			int num = -1;
			int min = 1;
			int max = 10;
			int count = 1;
			int guess = scanner.nextInt();
			while (secret!=guess ) {
				if (secret < guess) {
					System.out.println("lower");
				}else {
				if	(secret > guess);
					System.out.println("higher");
				}
				System.out.printf("Your guess ("+ count +"/4):"  );
				
				guess = scanner.nextInt();//guess again
				count++;
			}
				
			System.out.printf("Execellent! The secret number is " + "%s",secret);
		
	
				if(count>2){
			
			System.out.println("Great! The secret number is "+ secret);
				}
			}
				
					}