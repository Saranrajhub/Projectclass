package com.project;

import java.util.Enumeration;
import java.util.Vector;

public class Project {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector();
		
		v.add("Java");
		v.add("Python");
		v.add(".net");
		v.add("Selenium");
		v.add("Linux");		
		
		Enumeration<String> elements = v.elements();
		
		while (elements.hasMoreElements()) {
			String string = (String) elements.nextElement();
			System.out.println(string);
		}
		
System.out.println("new person change");
	}

}
