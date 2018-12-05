package com.staticEx;

import com.sample.Car;

public class Bike implements Vehical{

	
	@Override
	public void move() {
		System.out.println("Bike");
	}
	public static void main(String args[]) {
		Vehical obj=new Car();
		obj.move();
	}
	
}
