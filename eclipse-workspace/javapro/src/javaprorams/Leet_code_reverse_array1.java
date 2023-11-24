package javaprorams;

import java.util.Arrays;

public class Leet_code_reverse_array1{
	

	public static void  reverse_Numbers(int nums[], int k) {

		k=k%nums.length;
		System.out.println(k);
		if (nums == null || k<0)
		{
			throw new IllegalArgumentException("Illegal argument!");
		}

		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
		System.out.println(Arrays.toString(nums));
		//return nums;

	}	
	public static void reverse(int[] nums, int start, int end){
		while(start < end){
			int temp = nums[start]; 
			nums[start] = nums[end]; 
			nums[end]=temp; 
			start++; end--; 
		}
	}




	public static void main(String[] args) {

		int[] Arrayq = { 1, 2, 3, 4, 5}; 
		reverse_Numbers(Arrayq,2) ;


	}
}


