package com.staticEx;

public class StaticEx {
	int a=10;
	static int b=20;

	static {
		System.out.println("inside static block");
		//System.out.println(a);
		System.out.println(b);
	}
	{
		System.out.println("inside non static block");
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		//int a=100;
		System.out.println("inside main()");
		m2();
		new StaticEx().m1();
		//System.out.println(a);
		System.out.println(b);
		
	}

	public void m1() {
		System.out.println("inside non static m1()");
		System.out.println(a);
		System.out.println(b);
	}
	public static void m2() {
		System.out.println("inside static m2()");
		//System.out.println(a);
		System.out.println(b);
	}
}
