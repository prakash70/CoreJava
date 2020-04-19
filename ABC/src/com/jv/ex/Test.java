package com.jv.ex;

public class Test {

	public static void main(String[] args) {
		try{
			badMethod();
			System.out.println("A");
		}catch(Exception ex){
			System.out.println("b");
		}
		finally{
			System.out.println("c");
		}
		System.out.println("d");

	}
public static void badMethod() {
	throw new RuntimeException();
}
}
