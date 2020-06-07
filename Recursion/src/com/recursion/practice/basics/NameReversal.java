package com.recursion.practice.basics;

public class NameReversal {

	public static void main(String[] args) {
		System.out.println(reverseNameRecursive("Aarunya"));
	}
	
	private static String reverseNameRecursive(String theName){
		if(theName.length() == 0) {
			return theName;
		}
		//System.out.println(theName.substring(1));
		//System.out.println(theName.charAt(0));
		System.out.println("aa :::" + theName.substring(1) + theName.charAt(0));
		return (reverseNameRecursive(theName.substring(1)) + theName.charAt(0)) ;
	}

	/*A A R U N Y A
	A Y N U	R A	A*/
	
}
