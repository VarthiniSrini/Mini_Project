package org.Project_Selenium;

public class Pojo_B {
	
	public static void main(String[] args) {
		
		Pojo_A pojo = new Pojo_A();
		
		int value = pojo.getA();
		
		System.out.println("Value of a :"+value);
		
		System.out.println("After Setters");
		
		pojo.setA(1229);
		
		int afterset_A = pojo.getA();
		
		System.out.println(afterset_A);
	}

}
