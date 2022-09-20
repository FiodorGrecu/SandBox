package com.noorteck.qa.features;

public class APIUtil {

	
	//non-static method
	public String converToUpper(String str) {	
		String result = "Converting to UPPERCASE: " + str.toUpperCase();	
		return result;
	}
	
	//static method
	public static String duplicate(String str) {
		
		String result = "Duplicating: " + str+str;
		
		return result;
	}
	
	//void method
	public void getResult(String s1, String s2) {
		System.out.println(s1.toUpperCase() + s2.toLowerCase());
	}
	
}
