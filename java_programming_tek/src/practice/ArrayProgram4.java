package practice;

import java.util.Arrays;

public class ArrayProgram4 {
	public static void main(String[] args) {
		int [] a = {2,5,4,3,6};
		int sum = getSum(a);
		
		for(int i=0;i<a.length;i++) {
			a[i]=sum-a[i];
			
		}
		System.out.println(Arrays.toString(a));
		
	}
	
	public static int getSum(int [] a) {
		int sum=0;
		for(int x:a) {
			sum=sum+x;
		}
		
		return sum;
	}

}
