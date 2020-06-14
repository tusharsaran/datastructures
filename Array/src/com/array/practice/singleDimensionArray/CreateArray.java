package com.array.practice.singleDimensionArray;
/*
 * Time complexity :
 * T(∞) =  O(n)
 */
public class CreateArray {

	public static void main(String[] args) {
		//declaring an array // ------------------ O(1)
		int[] arry;   
		
		//creating an array //-------------- O(1)
		arry = new int[5]; 
		
		//initializing an array // --------------------- O(n)
		arry[0] = 3; 
		arry[1] = 6;
		arry[2] = 0;
		arry[3] = 534;
		arry[4] = 2;
		
		System.out.println(arry[4]);
			

	}

}
