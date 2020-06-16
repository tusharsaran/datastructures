/**
 * 
 */
package com.array.practice.complex.problems;

/**
 * @author tusharsaran
 *
 *         Given an array of ints length 3, return a new array with the elements
 *         in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 *
 *         reverse3([1, 2, 3]) → [3, 2, 1] 
 *         reverse3([5, 11, 9]) → [9, 11, 5]
 *         reverse3([7, 0, 0]) → [0, 0, 7]
 */
public class ReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arry = { 1, 2, 3 };
		int[] finalArray = reverse3(arry);
		for(int j = 0; j <= finalArray.length - 1; j++) {
			System.out.println(finalArray[j]);
		}
	}

	public static int[] reverse3(int[] nums) {
		int len = nums.length - 1;
		int[] finalArray = new int[nums.length];
		for (int i = 0; i <= nums.length - 1; i++) {
			for (int j = len; j >= 0; j--) {
				finalArray[j] = nums[i];
				len--;
				break;
			}
		}

		return finalArray;
	}

}
