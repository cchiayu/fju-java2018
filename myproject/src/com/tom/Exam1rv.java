package com.tom;

import java.util.Scanner;

public class Exam1rv {
/* �Ĥ@�D  �q���{�� 20�� 
			���]�u���x�_�찪�������A��{����1000���A�Ӧ^����2000���A���E��
			�г]�p���{���A���L�����H�U�W�d (���糧�D�~������)
			1. �߰ݨϥΪ̭n�ʶR�i�ơA�p�U:
			Please enter number of tickets: 
			2. ���o�ϥΪ̿�J���i�ƫ�A�A�߰ݴX�i�Ӧ^���A�p�U:
			How many round-trip tickets: 
			3. �̫�L�X�������i�ơB�Ӧ^���ƻP�`���B�A�p�U:
			Total tickets: 5
			Round-trip: 3
			Total: 7400
			4. �����ᵲ���{���Y�i
			�� �Y���Q�����O�]�p�������D�A�[�������C

		�ĤG�D  �s��q���\��  10��
			�ӲĤ@�D�A�Х[�J���n���]�p�A���{������s��q��
			(�q���@����A�~��U�@���q��)
			��ϥΪ̷Q�����q���ɡA�u�n�ʶR�i�ƿ�J -1 �A�Y�����{���C
			�� �C���q�������G���n���T�~�����C
		*/
	public static void main(String[] args){
		Ticket ticket = new Ticket(false);
		Ticket roundTicket = new Ticket(true);
		
		Scanner scanner = new Scanner(System.in);
		int numOfTicket = 0;
		while ( numOfTicket != -1){
			System.out.print("Please enter number of tickets:");
			numOfTicket = scanner.nextInt();
			if (numOfTicket ==-1)
				break;
			System.out.print("How many round-trip tickets:");
			int rtrip = scanner.nextInt();
			System.out.println("Total tickets: " + numOfTicket);
			System.out.println("Round-trip: " + rtrip);
			int total = (numOfTicket-rtrip)*ticket.getPrice() + roundTicket.getPrice()*rtrip;
			System.out.println("Total: " + total);
		}
		}
	
	
	
	
}


