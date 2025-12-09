package com.xyz;

import java.util.Iterator;

//classs
//runnable interface

public class Threads extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello" + i);		}
	}

	public static void main(String[] args) {
		Threads bb = new Threads();
		bb.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main" + i);

		}

	}
}
