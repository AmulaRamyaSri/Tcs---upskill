package com.xyz;

public class Localtoinstance {
	
	int a;
	int b;
	 void add(int c , int d)
	 {
		 a = c;
		 b = d;
	 }
	 void div()
	 {
		 System.out.println("div"+(a/b));
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Localtoinstance l = new Localtoinstance();
		l.add(9, 3);
		l.div();
	}

}
