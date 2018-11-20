package com.tom;

public class Student {
	
	private static final String String = null;
	String name;
	int english;
	int math;
	
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.print(name + "\t" + english + "\t" + math +"\t" + getAverage()+"\t") ;
		if (english>math){
			System.out.print(english+"\t");
		}else{
			System.out.print(math +"\t");
		}
			
		if(getAverage()  < 60 ){
			
		System.out.println("FAILED");
		}else
		System.out.println("PASS");
	}

		public int getAverage(){
			return(english+math)/2;	
	
		}
			
		public char getAverage1(){
			char grading = 'F';
			int average = getAverage();
			switch(average/10){
			case 10:
			case 9:
				grading = 'A';
				break;
			case 8:
				grading = 'B';
				break;
			 case 7:
				 grading = 'C';
				break;
			case 6:
				grading = 'D';
				break;
				default:
					grading = 'F';
				}
		}



			
	public Student(String name, int english , int math){
		
		this.name = name;
		this.math = math;
		this.english = english;
	}	
			
	
		
	
}


