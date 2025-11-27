package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int [] nums = {4,3,6,7,2,5,1};
		System.out.println("Before Sorting: "+Arrays.toString(nums));
		
		for(int i=0;i<nums.length;i++) {
			for(int j= 0; j<nums.length-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			
			}
			System.out.println(Arrays.toString(nums));		
		}
		
		System.out.println("After Sorting: "+Arrays.toString(nums));
		
	}

}
