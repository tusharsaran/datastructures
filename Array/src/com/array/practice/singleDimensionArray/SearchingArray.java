package com.array.practice.singleDimensionArray;

public class SearchingArray {

	public static void main(String[] args) {
		int[] arry = {2,445,566,23,353};
		findArrayIfNumberExists(arry, 2);
		findCellNumberIfNumberExists(arry, 232);

	}
	
	public static void findArrayIfNumberExists(int [] arry, int noToSearch) {
		boolean isexists = false;
		try {
			for(int i = 0; i <= arry.length - 1; i++) {
				if(arry[i] == noToSearch) 
					isexists = true;
			}	
			if(isexists) {
				System.out.println(noToSearch + " exists in array");
				}else {
					System.out.println("number  does not exist in array");
				}
		}catch(Exception ex) {
			System.out.println("Array do not exists.");
		}
	}
	
	public static void findCellNumberIfNumberExists(int [] arry, int noToSearch) {
		int cellNo = 0;
		try {
			for(int i = 0; i <= arry.length - 1; i++) {
				if(arry[i] == noToSearch) 
					cellNo = i;
			}	
			if(cellNo > 0) {
				System.out.println("cell No is "+ cellNo);
				}else {
					System.out.println("number does not exist in array");
				}
		}catch(Exception ex) {
			System.out.println("Array do not exists.");
		}
	}

}
