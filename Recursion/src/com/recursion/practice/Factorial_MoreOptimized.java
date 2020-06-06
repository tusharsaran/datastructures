package com.recursion.practice;

/*
 * this class is to compute the Factorial, this is more optimed than the previous factorial class
 * factorial is the product of all positive integers starting from 1 to n
 * it is denoted by n! (n exclamation)
 * and factorial is only calculated for non-negative integers 
 */
public class Factorial_MoreOptimized {

	public static void main(String[] args) {
		// output of 5!
		System.out.println(findFactorial(5));
	}
	
	static int findFactorial(int num) {
		if(num < 1) {
			return 1;
		}else {
			return (num * findFactorial(num -1));
		}
	}

}
