package com.tom;

	import java.util.Random;

	import java.util.Scanner;
	
	public class Exam3rv {

	    /* �ĤT�D  �q�Ʀr�{�� 20�� 
			1. �����ͤ@�Ӥ���1��10���üơA�����K�Ʀr (���]�O7)
			2. ���ϥΪ̲q�o�ӼƦr�A�p�U:
			Your guess: 5(�ϥΪ̲q5)
			3. ���ܨϥΪ̭n���@�I�ΧC�@�I�A�A�ХL�q�U�@���A�p�U:
			higher
			Your guess: 9(�ϥΪ̲q9)
			lower
			4. ��ϥΪ̲q�����K�Ʀr�ɡA�L�X:
			Great! The secret number is 7
			
			����: �bwhile�j�餤�i�ϥ�break���O���X�j��~�C
			�� �Y���Q�����O�]�p�������D�A�[�������C
			
		    �ĥ|�D �p��q�X�� 10��
		        �ӲĤT�D�A�p�G�ϥΪ̲q�G���H��(�]�A�G��)�q��ɡA�����:
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
			int guess = scanner.nextInt();
			while (secret!=guess ) {
				if (secret < guess) {
					System.out.println("lower");
				}else {
				if	(secret > guess);
					System.out.println("higher");
				}
				System.out.printf("Your guess: " + "%s" , guess );
				guess = scanner.nextInt();//guess again
			}
			System.out.printf("Great! The secret number is " + "%s",secret);
		}
		}
			


	
	
	
	
	