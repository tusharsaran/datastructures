package com.array.practice.complex.problems;

public class TwoSum {

	public static void main(String[] args) {
		int[] numbers = {-1,0};
		int target = -1;
		int[] output = twoSum(numbers, target);
		System.out.println(output[0]);
		System.out.println(output[1]);
		
		int[] nums = {-1};//{1,2,3,4,5,6,7}; 
		int k = 2;
		rotate(nums, k);
		//System.out.println(output1[0]);
		//System.out.println(output1[1]);
	}
	
	public  static int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        for(int i = 0; i < numbers.length;  i++){
            if(numbers[i] > target){
                break;
            }
            for(int j = i+1; j < numbers.length;  j++){
                if(numbers[j] != 0 &&  numbers[j] > target){
                    break;
                }
                if(numbers[i] + numbers[j] == target){
                   output[0] =  i+1;
                   output[1] =  j+1;
                }
            }
        }
        return output;
    }
	
	
	 public static void rotate(int[] nums, int k) {
		 // speed up the rotation
		    k %= nums.length;
		    int temp, previous;
		    for (int i = 0; i < k; i++) {
		      previous = nums[nums.length - 1];
		      for (int j = 0; j < nums.length; j++) {
		        temp = nums[j];
		        nums[j] = previous;
		        previous = temp;
		      }
		    }
	 }

}
