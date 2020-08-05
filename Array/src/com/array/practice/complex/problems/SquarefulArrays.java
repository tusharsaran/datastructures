/**
 * 
 */
package com.array.practice.complex.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author tusharsaran
 *
 */
public class SquarefulArrays {

	static  int result = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,8,17};
		int output = numSquarefulPerms(arr);
		System.out.println(output);

	}
    public static boolean isPerfect(int number) {
        double sr = Math.sqrt(number); 
        // If square root is an integer 
        return ((sr - Math.floor(sr)) == 0); 
    }
   
    
    
    public static int numSquarefulPerms(int[] A) {
        Arrays.sort(A);
        numSquarefulPermsUtil(A, new boolean[A.length], new ArrayList<Integer>());
        return result;
    }
    
    
    public static void numSquarefulPermsUtil(int[] nums, boolean[] used, List<Integer> list){
        if(list.size()==nums.length){
            result++;
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) 
            	continue;
            //if(i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) 
            	//continue;
           // if(list.size() > 0 && !isPerfect(nums[i] + list.get(list.size() - 1))) 
            	//continue;
            used[i]=true;
            list.add(nums[i]);
            numSquarefulPermsUtil(nums,used,list);
            used[i]=false;
            list.remove(list.size()-1);
        }
    }
}