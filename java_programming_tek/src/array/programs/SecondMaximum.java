package array.programs;

public class SecondMaximum {
	public static void main(String[] args) {
		int[] a = {200,60,0,200};
		int max=Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		for(int i =0; i<a.length;i++) {
			if(a[i]>max) {
				smax=max;
				max=a[i];
			}else if(a[i]>smax&&a[i]!=max)
				smax=a[i];
		}
		System.out.println("Max: "+max);
		System.out.println("Second Max: "+smax);
	}
	
}
