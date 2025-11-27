package sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int [] a = {4,6,5,2,1,3,7};
		System.out.println("Before Sorting: "+Arrays.toString(a));
		for(int i=0; i<a.length-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<a.length-1;j++) {
				if(a[j]<a[minIndex]) 
					minIndex=j;
			}
			int temp=a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
			System.out.println(Arrays.toString(a));	
		}
		
		System.out.println("After Sorting: "+Arrays.toString(a));
	}

}
