package com.xyz;

class Abc
{
 void m1()
 {
	 System.out.println("Mehtod m1 form parent class");
 }
 
}
public class Supercls2 extends Abc{
   
	 void m1()
	 {
		 System.out.println("Mehtod m1 form child class");
	 }
		
	 void m2()
	 {
		 this.m1();
		 super.m1();
		 System.out.println("Mehtod m2 form child class");
	 }

	public static void main(String[] args) {
		Supercls2 dd = new Supercls2();
		dd.m2();
	    

	}
}
