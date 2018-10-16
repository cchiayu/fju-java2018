package com.tom;

public class Hello {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.name = "wang";
		stu.english =70;
		stu.math = 90;
		stu.print();
		
		
		System.out.println( 4 <= 5 );
		System.out.println(3 >= 6 );
		
		String s3 = new String ("717");
		String s4 = new String ("717");
		
		System.out.println(s3==s4);
		
		
		String s1 = new String("abc");
		String s2 = new String ("abc");
		
		System.out.println(s1.equals(s2));
		
		
		
		
		
		
		
		
		
		Person won = new Person(60.5f,1.82f);
	    won.height = 1.82f;
	    won.weight = 60.5f;
	    float height = won.height;
	    float weight = won.weight;
		float bmi = weight / (height*height);
	    System.out.println(bmi);
				
//		String name = "jack";
//		int english = 95;
//		int math = 75 ;
//		System.out.println(name + "\t" + english + "\t" + math +"\t" +(english+math)/2 );
		
		
//       int age = 18;
//       String name = "melissa";
//       int schoolYear = 107;		
//       float weight = 45.5f;
//       float num = 12.2f;
//       float height = 1.62f;
//       float bmi = weight / (height*height);
//       age = age + 1;
//       System.out.println(age);
//       System.out.println(name);				
//       System.out.println(schoolYear);
//       System.out.println(weight);
//       System.out.println(num);
//       System.out.println(bmi);
//       System.out.println(age);
       
        
        
      
        
        
        
        
        
        
        
    }
}