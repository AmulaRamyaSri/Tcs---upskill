package com.xyz;
class xyz
{
	int a = 3;
	int b  = 7;
}
public class Supercls extends xyz{
	int a = 9;
	int b = 8;
	void add(int a , int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supercls s = new Supercls();
		s.add(2, 4);

	}

}
