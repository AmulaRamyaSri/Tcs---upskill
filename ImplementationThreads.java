package com.xyz;

class MyRunnable implements Runnable
{
	public void run() 
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

public class ImplementationThreads
{
	public static void main(String[] args) 
	{
		System.out.println("Begin main");
		 MyRunnable mr = new MyRunnable(); // step 2 create an object of the class which implements Runnable 
		Thread t = new Thread(mr); // step 3 create a thread & pass the runnable object to the constructor of class Thread
		t.start(); // step 4 start the thread 
		System.out.println("End main");
	}
}


