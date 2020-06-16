/**
 * 
 */
package com.array.practice.complex.problems;

/**
 * @author tusharsaran
 *
 *	Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. 
 *  Return the array which has the largest sum. In event of a tie, return a.
 *
 *biggerTwo([1, 2], [3, 4]) → [3, 4]
 *biggerTwo([3, 4], [1, 2]) → [3, 4]
 *biggerTwo([1, 1], [1, 2]) → [1, 2]
 */
public class Biggertwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {1, 3};
		int[] b = {2, 2};
		int [] finalArray = biggerTwo(a, b);
		for(int j = 0; j <=  finalArray.length - 1; j++){
		    System.out.println(finalArray[j]);
		  }
		
	}
	
	
	public static  int[] biggerTwo(int[] a, int[] b) {
		  int aSum = 0;
		  int bSum = 0;
		  for(int i = 0; i <=  a.length - 1; i++){
			  aSum += a[i];
		  }
		 for(int j = 0; j <= b.length -1; j++) {
					 bSum += b[j];
		 }
		 return aSum >= bSum ? a : b; 
		}
}
