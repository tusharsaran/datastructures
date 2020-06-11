package com.recursion.practice.basics;

public class BiggestNumberinArray {

	public static void main(String[] args) {
		int [] numbers = {3,2,30,5, 50,60,12,54,32,86,57,12,6,9};
		System.out.println(findBiggestNumber(numbers, numbers.length-1));

	}
	
	static int findBiggestNumber(int [] numArary, int length) {		
		if(length == 0) {
			return numArary[length];
		}else {		
			int output =  findBiggestNumber(numArary , length - 1);
			//System.out.println("output is " + output);
			int num = numArary[length];
			//System.out.println("num is " + num);
			int highestNumber =  output > num ? output : num;
			//System.out.println("highestNumber is " + highestNumber);
			return highestNumber;
			}
		
	}

}
