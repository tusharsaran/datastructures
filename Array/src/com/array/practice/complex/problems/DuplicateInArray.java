/**
 * 
 */
package com.array.practice.complex.problems;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author tusharsaran
 *
 *find duplicates in array
 */
public class DuplicateInArray {
	static Instant start  = null;
	static Instant end = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,2,8,2,3,4};
		start = Instant.now();
		System.out.println(findDuplicates(nums));
		end = Instant.now();
		System.out.println(Duration.between(start, end));
		
		
		/*start = Instant.now();
		System.out.println(findDuplicates1(nums));
		end = Instant.now();
		System.out.println(Duration.between(start, end));
*/
	}

	    public static List<Integer> findDuplicates(int[] nums) {
	        int size = nums.length;
	        start = Instant.now();
	        for (int i = 0; i < size; ++i){
	            while (nums[i] - 1 != i && nums[i] != nums[nums[i] - 1]){
	                swap(nums, i, nums[i] - 1);
	            }
	        }
	        end = Instant.now();
			System.out.println("total time " + Duration.between(start, end));
	        List<Integer> res = new ArrayList<>();
	        
	        start = Instant.now();
	        for (int i = 0; i < size; ++i){
	            if (nums[i] - 1 != i){
	                res.add(nums[i]);
	            }
	        }
	        end = Instant.now();
			System.out.println(Duration.between(start, end));
	        return res;
	        
	    }
	    
	    
	    private static void swap(int[] nums, int i, int j){
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
	    
	    
	    public static List<Integer> findDuplicates1(int[] nums) {
	    	
	    	start = Instant.now();
	    	Arrays.sort(nums);
			end = Instant.now();
			System.out.println(Duration.between(start, end));
	        
	        List<Integer> numList =  new ArrayList();
	        int count = 0;
	        
	        start = Instant.now();
	        for(int i = 0; i <  nums.length - 1; i++){
	        	count ++;
	            //System.out.println(nums[i]);
	            //if(i < Math.floor(nums.length/2)){
	            if(nums[i] == nums[i+1] 
	              && (!numList.contains(nums[i])))
	                numList.add(nums[i]);
	              
	                
	            if(nums[(nums.length-1) - i] == nums[(nums.length-1) - (i +1)]
	               && (!numList.contains(nums[(nums.length-1) - i])))
	                numList.add(nums[(nums.length-1) - i]);
	                   
	                
	            /*}  else{
	                break;
	            }*/
	            
	                
	        }
	        end = Instant.now();
			System.out.println(Duration.between(start, end));
			System.out.println("count" +count);
	        return numList;
	    }
	
}
