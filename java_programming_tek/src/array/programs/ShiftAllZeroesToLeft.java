package array.programs;

import java.util.Arrays;

public class ShiftAllZeroesToLeft {
	public static void main(String[] args) {
		int[] a = {0,0,1,2,0,1,5,0};
		int[] b = new int [a.length];
		int index = b.length-1;
		for(int i = a.length-1;i>=0;i--) {
			if(a[i]!=0)
				b[index--]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
