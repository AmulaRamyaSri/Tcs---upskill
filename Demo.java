package com.xyz;

class cat
{
	void bark()
	{
		System.out.println("meow meow");
	}
}
class dog extends cat
{
	void dbark()
	{
		System.out.println("bow bow");
	}
}


public class Demo extends dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo dd = new Demo();
		dd.bark();
		dd.dbark();

	}
	


}
