package com.tom;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello world");
        int age = 18;
        String name = "melissa";
        int schoolYear = 107;		
        float weight = 45.5f;
        float num = 12.2f;
        float height = 1.62f;
        float bmi = weight / (height*height);
        age = age + 1;
        System.out.println(age);
        System.out.println(name);				
        System.out.println(schoolYear);
        System.out.println(weight);
        System.out.println(num);
        System.out.println(bmi);
        System.out.println(age);
        Person P = new Person(height, weight);
        P.height = 1.82f;
        P.weight = 60.5f;
        System.out.println(bmi);   
        
      
        
        
        
        
        
        
        
    }
}