package com.xyz;

class efg {
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}

}

public class Getset extends efg {
	public static void main(String[] args) {
		Getset dd = new Getset();
		dd.setA(22);
		int xyz = dd.getA();
		System.out.println(xyz);
	}
}