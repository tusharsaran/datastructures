package com.recursion.practice.fibonacci;

public class FibonacciSeriesStartingFrom1 {

	public static void main(String[] args) {
		System.out.println(findFibonacciNumber(10));
	}
	
	static int findFibonacciNumber(int num) {
		if(num <= 1)
			return num;
		return (findFibonacciNumber(num - 1) + findFibonacciNumber(num - 2 ));
		
	}

}
