package practice;

import java.util.Arrays;

public class ConcatenationOfArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 1 };
		int n = a.length;
		int[] b = new int[2 * n];

		for (int i = 0; i < n; i++) {
			b[i] = a[i];
			b[i + n] = a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
