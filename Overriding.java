package com.xyz;

public class Overriding extends details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			void animal ()
			{
				System.out.println("cat");
			}
			overriding o = new overriding();
			o.animal();
			o.drinks();

	}

}

class details {
	public void animal()
	{
		System.out.println("dog");
	}
	public void drinks()
	{
		System.out.println("milk");
	}

}


