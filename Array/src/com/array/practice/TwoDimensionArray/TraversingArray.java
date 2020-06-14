package com.array.practice.TwoDimensionArray;

/*
 * Time complexity :
 * T(∞) =  O(1) * O(m) *O(n)
 * 		=> O(mn)
 * 
 * Space complexity :  O(1)
 */
public class TraversingArray {

	public static void main(String[] args) {
		int[][] arry = new int[2][3];
		arry[0][0] = 2;
		arry[0][1] = 35;
		arry[0][2] = 26;
		arry[1][0] = 77;
		arry[1][1] = 3534;
		arry[1][2] = 74;
		System.out.println("row lenth is  " + arry.length); 
		System.out.println("column lenth is  " + arry[0].length);
		traverseArray(arry);
	}

	//traversing an array
	public static void traverseArray(int[][] arry) { //------------------------------------------------------------------------------O(mn)
		try {
			for (int row = 0; row < arry.length; row++) { //------------------------------------------O(m)
				for (int col = 0; col < arry[0].length; col++) { //------------------------------------- O(n)
					System.out.println("column value is  :" + arry[row][col]); //------------------------ O(1)
				}
			}
		} catch (Exception ex) {
			System.out.println("Array do not exists.");
		}
	}

}
