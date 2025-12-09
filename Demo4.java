package com.xyz;

import java.util.*;
import java.util.ArrayList;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList arr = new ArrayList<>();
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			arr.add(sc.nextInt());
		}
		System.out.println(arr);
		arr.remove(0);
		System.out.println(arr);
	}

}
