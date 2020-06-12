package com.recursion.practice.basics;

public class CellNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray  = {1,3,4,5,7,9,10,12,14,28,45,67,77,124,321,442,552,557,775};
		//findMid(numArray, 0,numArray.length);
		try {
			System.out.println(findCellNumberInArray(124, numArray, 0, numArray.length-1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	static int findCellNumberInArray(int numToFind, int[] numArray, int start, int end) throws Exception {
		int mid  =  findMid(numArray, start, end);
		if(start == end) {
			if(numToFind == numArray[mid]) {
			return mid; 
			} else {
				throw new Exception("no number found in array");
			}
		}else if(numToFind > numArray[mid]){
			return findCellNumberInArray(numToFind, numArray, mid, end);
		}else if(numToFind < numArray[mid]) {
			return findCellNumberInArray(numToFind, numArray, start, mid);
		}
		return mid;
	}
	
	private static int findMid(int[] numArray, int start, int end) {
		//int mid = 0;
		double val  = (double)(end-start)/2;
		//System.out.println("val :: " +val);
		int length = (int)Math.ceil(val) + start;
		//System.out.println("length ::" + length);
		//mid  = numArray[length];
		//System.out.println("mid :::" +mid);
		return length;
	}

}
