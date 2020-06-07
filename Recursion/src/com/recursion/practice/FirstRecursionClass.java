package com.recursion.practice;
/*
 * @author : tusharsaran
 * this is a first simple recursion class
 * 
 */
public class FirstRecursionClass {

	public static void main(String[] args) {
		System.out.println(showNumber(5));
	}
	
	static int showNumber(int num) {
		if(num <  1) {
			System.out.println("the number is  : " +  num);
			return num; 
		}else {
			showNumber(num -  1);
			System.out.println("the number is  : " +  num);
			return num; 
		}
		
	}

}
