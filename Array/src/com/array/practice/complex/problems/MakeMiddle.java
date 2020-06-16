/**
 * 
 */
package com.array.practice.complex.problems;

/**
 * @author tusharsaran
 *
 *
 *Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. 
 *The original array will be length 2 or more.
 *
 *makeMiddle([1, 2, 3, 4]) → [2, 3]
 *makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
 *makeMiddle([1, 2]) → [1, 2]
 *
 *
 *
 */
public class MakeMiddle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println((int) Math.ceil(5/2));
		int[] arry = {1, 2};
		int[] outputArray = makeMiddle(arry);
		for(int j = 0; j <= outputArray.length - 1; j++) {
			System.out.println(outputArray[j]);
			} 

	}
	
	public static int[] makeMiddle(int [] nums) {
		int[] finalArray = new int[2];
		int cellNo = 0;
		int startIndex = 0;
		int endIndex = 0;
		int len = nums.length - 1;
		for(int i = 0; i <= nums.length - 1; i++) {
			if(len < 2) {
				return nums;
			} else {
				startIndex = (int) Math.ceil((len/2));
				endIndex =   startIndex + 1;
				if(i == startIndex || i == endIndex) {
					finalArray[cellNo] = nums[i];
					cellNo++;
				}
					
			}
		}
		
		return finalArray;
	}

}
