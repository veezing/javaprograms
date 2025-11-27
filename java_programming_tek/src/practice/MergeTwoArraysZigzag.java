package practice;

import java.util.Arrays;

public class MergeTwoArraysZigzag {
	public static void main(String[] args) {
		int[] a = { 1, 3, 5 };
		int[] b = { 2, 4, 6, 8, 10 };

		int[] merged = new int[a.length + b.length];
		int indx1 = 0, indx2 = 0, x = 0;
		
		while(indx1<a.length && indx2<b.length) {
				merged[x++]=a[indx1++];
				merged[x++]=b[indx2++];
		}
		while (indx1 < a.length)
			merged[x++] = a[indx1++];

		while (indx2 < b.length)
			merged[x++] = b[indx2++];
		
		System.out.println(Arrays.toString(merged));
	}

}
