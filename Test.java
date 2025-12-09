package com.xyz;

public class Test {
	int a = 5;
	int b = 6;
	void add(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.add(2, 3);
	}

}
