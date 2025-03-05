package com.project;

import java.util.Iterator;
import java.util.Vector;

public class Iteration {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector();
		v.add("Java");
		v.add("Python");
		v.add(".net");
		v.add("Selenium");
		v.add("Linux");	
		
		
		
	   Iterator<String> iterator = v.iterator();
	   
	   while (iterator.hasNext()) {
		String string = iterator.next();
		System.out.println(string);	
		
		if(string.equals(".net")) {
			iterator.remove();	
		}
	}
		
	   System.out.println(v);
	   System.out.println("updatedfor git");
		
	}
	


}
