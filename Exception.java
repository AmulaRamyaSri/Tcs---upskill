package com.xyz;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(10/2);
			int arr[] = {1,2,3};
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception raised"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception raised"+e);
		}
	}

}
