package com.sample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		System.out.println(al.size());
		al.add("Hey");
		al.add("program");
		al.add("");
		al.add("This");
		al.add("is");
		al.add("first");
		al.add("program");
		al.add("");
		System.out.println(al.size());
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
