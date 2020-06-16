/**
 * 
 */
package com.array.practice.complex.problems;

/**
 * @author tusharsaran
 * 
 * 
Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.


maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]

 *
 */
public class MaxEnd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arry = {11, 15, 9};
		arry =  maxEnd3(arry);
		for(int j = 0; j <= arry.length-1; j++) {
			System.out.println(arry[j]);
		}

	}
	
	public static int[] maxEnd3(int[] nums) {
		int maxValue = nums[0] >= nums[nums.length-1] ? nums[0] : nums[nums.length-1];
		for(int i = 0; i <= nums.length-1; i++) {
			nums[i] = maxValue;
		}
		return nums;
	}

}
