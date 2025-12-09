package com.xyz;

public class Demo1 {

	public Demo1() {
		this(3);
		System.out.println("constructor");
	}

	public Demo1(int a) {
		
		System.out.println(" Parametrised constructor");

	}

	public static void main(String[] args) {
		Demo1 dd = new Demo1();

	}
}
