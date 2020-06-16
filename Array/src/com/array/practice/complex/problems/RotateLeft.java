/**
 * 
 */
package com.array.practice.complex.problems;

/**
 * @author tusharsaran
 *
 *Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
 *
 *rotateLeft3([1, 2, 3]) → [2, 3, 1]
 *rotateLeft3([5, 11, 9]) → [11, 9, 5]
 *rotateLeft3([7, 0, 0]) → [0, 0, 7]
 *
 */
public class RotateLeft {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arry = {5, 11, 9};
		int[] finalArray = rotateLeft3(arry);
		for(int j = 0; j <= finalArray.length - 1; j++) {
			System.out.println(finalArray[j]);
		}
	}
	
	public static int[] rotateLeft3(int[] nums) {
		int len = nums.length;
		int[] finalArray = new int[len];
		for(int i = 0; i <= len - 1; i++) {
			if(i == (len- 1)) {
				finalArray[i] = nums[0];
			} else {
			finalArray[i] =  nums[i+1];
			}
		}
		return finalArray;
		  
	}

}
