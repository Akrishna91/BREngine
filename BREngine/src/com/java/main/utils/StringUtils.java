package com.java.main.utils;

import java.util.Scanner;

public class StringUtils {

	public static Object interpret(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(s);
		return sc.hasNextInt() ? sc.nextInt() : sc.hasNextLong() ? sc
				.nextLong() : sc.hasNextFloat() ? sc.nextFloat() : sc
				.hasNextDouble() ? sc.nextDouble() : sc.hasNextBoolean() ? sc
				.nextBoolean() : sc.hasNext() ? sc.next() : s;
				
				//o.getClass().getSimpleName()
			
	}
	
	public boolean isInt(String s){
		return interpret(s).getClass().getSimpleName().equals("Integer");
	}
	
	public boolean isLong(String s){
		return interpret(s).getClass().getSimpleName().equals("Long");
	}
	
	public boolean isDouble(String s){
		return interpret(s).getClass().getSimpleName().equals("Double");
	}
	
	public boolean isBoolean(String s){
		return interpret(s).getClass().getSimpleName().equals("Boolean");
	}
	
	
}
