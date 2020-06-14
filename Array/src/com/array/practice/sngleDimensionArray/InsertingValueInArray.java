package com.array.practice.sngleDimensionArray;

public class InsertingValueInArray {

	public static void main(String[] args) {
		int[] arry = new int[5];
		arry[0] = 3; 
		arry[1] = 6;
		arry[2] = 0;
		insert(arry, 4, 56);
	}
	
	//Insert value in the Array
			public static void insert(int[] arr, int location, int valueToBeInserted) {
				try {
					if (arr[location] == 0) {
						arr[location] = valueToBeInserted;
						System.out.println("Successfully inserted " + valueToBeInserted + " at location: " + location);
					} else {
						System.out.println("This cell is already occupied by another value.");
					}
					for(int i = 0; i <= arr.length -1; i++) {
						System.out.println("arr[i] value is " + arr[i]);
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Invalid index to access array !");
					// e.printStackTrace();
				}
			}

}
