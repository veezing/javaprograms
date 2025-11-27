package array.programs;

public class MaximumAndMinimum {
	public static void main(String[] args) {
		int[] a = {89,43,65,67,12,6};
		int max=a[0];
		int min = a[0];
		for(int i =1; i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Max: "+max);
		System.out.println("MIn: "+min);
	}
	
}
