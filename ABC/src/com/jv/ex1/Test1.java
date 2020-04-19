package com.jv.ex1;

import java.util.Properties;

public class Test1 {
	public static void main(String[] args) {
		Properties p = System.getProperties();
		p.setProperty("private", "scurvy");
		String s= p.getProperty("argProp")+ "";
		s+=p.getProperty("private");
		System.out.println(s);
	}

}
