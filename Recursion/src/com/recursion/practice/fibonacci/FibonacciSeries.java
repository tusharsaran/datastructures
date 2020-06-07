package com.recursion.practice.fibonacci;

public class FibonacciSeries {

	/*
	 * @author : tusharsaran
	 * this class represents fibonacci series, a fibonacci series is a series of numbers in which each number is sum of two preceding numbers
	 * First 2 numbers by definition are 0 and 1
	 * e.g. :  0,1,1,2,3,5,8,13,21.......
	 * 
	 * Question : Find the  nth number in the Fibonacci series? Here we will find the 4 number in the Fibonacci series
	 */
	
	public static void main(String[] args) {
		 try {
			System.out.println(findNumberInFibonacci(4));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	static int findNumberInFibonacci(int num) throws Exception {
		if(num <  1) {
			throw new Exception("number cannot be less than 1");
		}else if(num == 1 || num ==2) {
			return num - 1;
		}else {
			return findNumberInFibonacci(num - 2) + findNumberInFibonacci(num - 1) ;	
		}
		
		
	}

}
