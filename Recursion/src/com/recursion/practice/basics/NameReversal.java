package com.recursion.practice.basics;

public class NameReversal {

	public static void main(String[] args) {
		System.out.println(reverseNameRecursive("Pari"));
	}
	
	private static String reverseNameRecursive(String theName){
		String name = null;
		if(theName.length() == 0) {
			return theName;
		}
		//System.out.println(theName.substring(1));
		//System.out.println("charAt value is : " + theName.charAt(0));
		//System.out.println("sub string  value is : " +theName.substring(1));
		//System.out.println("lenght is : " +theName.substring(1).length());
		 name =  reverseNameRecursive(theName.substring(1));
		 //System.out.println("name is " + name);
		 String output =  name + theName.charAt(0);
		 
		 return output;
	}

	/*A A R U N Y A
	A Y N U	R A	A*/
	
}
