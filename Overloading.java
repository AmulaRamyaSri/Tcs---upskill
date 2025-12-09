package com.xyz;

public class Overloading {
	public void add()
	{
		System.out.println("Add");
	}
	public void add(int a)
	{
		System.out.println("Add"+a);
	}
	public static void main(String[] args)
	{
		Overloading o = new Overloading();
		o.add();
		o.add(3);
	}

}
