package com.staticEx;

public class LooslyCoupled {

	Vehical v;
	public void setV(Vehical v) {
		this.v = v;
	}
	void startJourney() {
		v.move();
	}


 public static void main(String args[]) {
	 LooslyCoupled obj=new LooslyCoupled();
	 obj.startJourney();
 }
}