package com.recursion.practice.factorial;
/*
 * @author : tusharsaran
 * this class is to compute the Factorial
 * factorial is the product of all positive integers starting from 1 to n
 * it is denoted by n! (n exclamation)
 * and factorial is only calculated for non-negative integers 
 */
public class Factorial {

	public static void main(String[] args) {
		//find the factorial of 5!
		factorial(5,1);
		
		//find the factorial of 10!
		factorial(10,1);
	}
	
	static int factorial(int num, int result) {
		if(num < 1) {
			System.out.println(result);
			return result;
		}else {
			 result  = result * num;
			//System.out.println("result is : "+ result);
			factorial(num - 1, result);	
		}
		return 0;
	}

}
