package thursday2703;

public class Task3 {
	public static void main(String[] args) {
		//WAJP to print factorial of positive odd numbers
		int[] a = {1,-3,4,6,7,-3,5,11,18,9};
		for(int i =0; i<a.length;i++) {
			if(a[i]>0 && a[i]%2==1) {
				System.out.println(a[i]+"! = "+getfactorial(a[i]));
			}
		}
	}
	public static int getfactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		return fact;
		
	}

}
