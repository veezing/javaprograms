package arrayPrograms;

public class LargestAndSecondLargest {
	public static void main(String[] args) {
		int [] a = {80,8,54,45,32,41,80};
		
		int max = a[0];
		int smax = Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]!=max)
				smax=a[i];
		}
		System.out.println(max);
		System.out.println(smax);
	}

}
