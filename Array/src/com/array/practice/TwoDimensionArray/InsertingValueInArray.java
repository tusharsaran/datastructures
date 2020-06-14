package com.array.practice.TwoDimensionArray;

/*
 * Time complexity :
 * T(∞) =  O(1) + O(1)
 * 		=> O(1)
 * 
 * Space complexity :  O(1)
 */
public class InsertingValueInArray {

	public static void main(String[] args) {
		int[][] arry = new int[2][3];
		  arry[0][0] = 2;
		  arry[0][1] = 35;
		  arry[1][0] = 77;
		  arry[1][2] = 74;
		insert(arry, 0,2, 56);
	}
	
	//Insert value in the Array
			public static void insert(int[][] arr, int rowNum, int colNum, int valueToBeInserted) {
				try {
					if (arr[rowNum][colNum] == 0) { //------------------------------------------------------------------ O(1)
						arr[rowNum][colNum] = valueToBeInserted;
						System.out.println("Successfully inserted " + valueToBeInserted + " at rowNum: " 
						+ rowNum + " and column number " + colNum); //--------------------------------------------------- O(1)
					} else { //------------------------------------------------------------------------------------------ O(1)
						System.out.println("This cell is already occupied by another value."); //------------------------ O(1)
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Invalid index to access array !");
					// e.printStackTrace();
				}
			}

}
