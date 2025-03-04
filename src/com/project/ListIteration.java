package com.project;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteration {
	
	public static void main(String[] args) {
		
		Vector<String> v= new Vector();
		
		
		
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("d");
		v.add("e");
		v.add("f");
		
		ListIterator<String> lt = v.listIterator();
		
		System.out.println("*********Before**********");
		System.out.println(v);

		while(lt.hasNext()) {
			String next = lt.next();
			
			if(next.equals("a")) {
				lt.add("Apple");
			}
			if(next.equals("b")) {
				lt.set("Banana");
			}
			if(next.equals("e")) {
				lt.remove();
			}
		}
	System.out.println("*********After**********");	
    System.out.println(v);
}
}
