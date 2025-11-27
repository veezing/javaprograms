package array.programs;

import java.util.LinkedHashSet;

public class TargetSum {
	public static void main(String[] args) {
		int[] a = {0,2,4,5,8,6,3,9,7,1,8};
		int targetSum=9;
		LinkedHashSet set = new LinkedHashSet();
		for(int i =0;i<a.length;i++) {
			for(int j =i+1;j<a.length;j++) {
				if(a[i]+a[j]==targetSum) {
					String sum = a[i]>a[j]?"("+a[j]+","+a[i]+")":"("+a[i]+","+a[j]+")";
					//String sum = "("+a[i]+" ,"+a[j]+")";
					set.add(sum);
				}
			}
		}
		System.out.println(set);
	}

}
