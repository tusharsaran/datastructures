package com.array.practice.singleDimensionArray;

public class TraversingArray {

	public static void main(String[] args) {
		int[] arry = {2,445,566,23,353};
		traverseArray(arry);

	}
	
	public static void traverseArray(int [] arry) {
		try {
			for(int i = 0; i <= arry.length - 1; i++) {
				System.out.println("arry value is  :" + arry[i]);
				
			}
		}catch(Exception ex) {
			System.out.println("Array do not exists.");
		}
	}

}
