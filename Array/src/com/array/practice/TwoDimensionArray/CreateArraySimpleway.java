package com.array.practice.TwoDimensionArray;
/*
 * Time complexity :
 * T(∞) =  O(1) + 01
 * 		=> O(1)
 * 
 * Space complexity : O(1)
 */
public class CreateArraySimpleway {

	public static void main(String[] args) {
		//Declaration, Instantiation and initialization ---  T(n) = O(1) as we do not loop while creating an array 
		int[][] arry = {{2,445,566},{23,75,7}}; //--------------------------O(1)
		System.out.println(arry[1][2]); //------------------------------O(1)
	}

}
