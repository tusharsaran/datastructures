package com.array.practice.TwoDimensionArray;
/*
 * Time complexity :
 * T(∞) =  O(n)
 * 
 * Space complexity : O(1)
 */
public class CreateArray {

	public static void main(String[] args) {
		//declaring an array // ------------------ O(1)
		int[][] arry;   
		
		//creating an array //-------------- O(1)
		arry = new int[2][3]; 
		
		//initializing an array // --------------------- O(mn) -- m (rows ) * n (columns)
		  arry[0][0] = 2;
		  arry[0][1] = 35;
		  arry[0][2] = 31;
		  arry[1][0] = 77;
		  arry[1][1] = 54;
		  arry[1][2] = 74;
		
		System.out.println(arry[0][1]);
			

	}

}
