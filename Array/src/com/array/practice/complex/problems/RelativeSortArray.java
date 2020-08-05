/**
 * 
 */
package com.array.practice.complex.problems;

import java.util.Arrays;

/**
 * @author tusharsaran
 *
 *Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.
 *
 */
public class RelativeSortArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
		System.out.println(relativeSortArray(arr1, arr2));
	}
	
	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
	    return sortArray(arr1, arr2);
	    }

	public static int[] sortArray(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		int counter = 0;

		// sorting an array
		Arrays.sort(arr1);

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr2[i] >= arr1[j]) {
					if (arr1[j] == arr2[i]) {
						output[counter++] = arr1[j];
						arr1[j] = -1;
					}
				} else {
					break;
				}
			}
		}

		for (int k = 0; k < arr1.length; k++) {
			if (arr1[k] != -1) {
				output[counter++] = arr1[k];
			}
		}

		return output;

	}

}
