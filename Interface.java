package com.xyz;

interface i1{
	abstract void m1();
}
public class Interface implements i1 {
		@Override
		public void m1() {
			// TODO Auto-generated method stub
			System.out.println("asdfasdfasd");
		}

		public static void main(String[] args) {
			Interface bb = new Interface();
			bb.m1();
		
	}

}
