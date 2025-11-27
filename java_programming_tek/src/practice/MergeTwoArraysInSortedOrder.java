package practice;

import java.util.Arrays;

public class MergeTwoArraysInSortedOrder {
	public static void main(String[] args) {
		int[] a = { 3, 4, 5, 8, 9};
		int[] b = { 1, 6, 10};

		int[] merged = new int[a.length + b.length];
		int indx1 = 0, indx2 = 0, x = 0;
		
		while(indx1<a.length && indx2<b.length) {
			if(a[indx1]<b[indx2])
				merged[x++]=a[indx1++];
			else
				merged[x++]=b[indx2++];
		}
		while (indx1 < a.length)
			merged[x++] = a[indx1++];

		while (indx2 < b.length)
			merged[x++] = b[indx2++];
		
		System.out.println(Arrays.toString(merged));
	}

}
