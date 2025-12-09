package com.xyz;

class MyThread extends Thread
{
	public void run() // step 1 define a thread
	{
		System.out.println("Begin of child thread");
		m1();
		System.out.println("End of child thread");
	}
	void m1()
	{
		System.out.println("Begin of m1");
		m2();
		System.out.println("End of m1");
	}	
	void m2()
	{
		System.out.println("Begin of m2");
		System.out.println("End of m2");
	} 
}

public class Extendsthreadsdemo 
{
	public static void main(String[] args)
	{
		System.out.println("Begin main");
		MyThread mt = new MyThread(); // step 2 create a child thread or user thread
		mt.start(); // step 3 start the thread
		System.out.println("Back in main");
		System.out.println("End main");
	}
}