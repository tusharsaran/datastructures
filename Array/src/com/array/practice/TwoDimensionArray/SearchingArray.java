package com.array.practice.TwoDimensionArray;

/*
 * Time complexity :
 * T(∞) =  O(1) * O(m) *O(n)
 * 		=> O(mn)
 * 
 * Space complexity :  O(1)
 */
public class SearchingArray {

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
		findArrayIfNumberExists(arry, 177);
		findCellNumberIfNumberExists(arry, 177);
	}

	public static void findArrayIfNumberExists(int [][] arry, int noToSearch) {
		boolean isexists = false;
		try {
			for (int row = 0; row < arry.length; row++) { //------------------------------------------O(m)
				for (int col = 0; col < arry[0].length; col++) { //------------------------------------- O(n)
					if(arry[row][col] == noToSearch) 
						isexists = true;
				}
			}
			if(isexists) {
				System.out.println(noToSearch + " exists in array");
				}else {
					System.out.println("number  does not exist in array");
				}
		} catch (Exception ex) {
			System.out.println("Array do not exists.");
		}
	}	
		
	
	public static void findCellNumberIfNumberExists(int [][] arry, int noToSearch) {
		int rowCellNo = 0;
		int colCellNo = 0;
		try {
			for (int row = 0; row < arry.length; row++) { //------------------------------------------O(m)
				for (int col = 0; col < arry[0].length; col++) { //------------------------------------- O(n)
					if(arry[row][col] == noToSearch) 
						rowCellNo = row;
						colCellNo = col;
				}
			}
			if(rowCellNo >  0 && colCellNo > 0) {
				System.out.println(noToSearch + " exists in array and it exists in row number : " + rowCellNo + " and the column number  :" + colCellNo);
			}else {
				System.out.println("number  does not exist in array");
			}
		}catch (Exception ex) {
			System.out.println("Array do not exists.");
		}
	}
}
