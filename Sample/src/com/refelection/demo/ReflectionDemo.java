package com.refelection.demo;

import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception{
		/*Test t=new Test();
		t.show();*/
		
		Class c=Class.forName("com.refelection.demo.Test");

		Test t=(Test)c.newInstance();
		//t.show();
		Method m=c.getDeclaredMethod("show", null);
		m.setAccessible(true);
		m.invoke(t, null);
	}

}
