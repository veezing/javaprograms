package thursday2703;

public class Task1 {
	static int sum;
	//WAJP to print sum of prime integers from the above array
	public static void main(String[] args) {
		int[] a= {1,-3,4,6,7,-3,5,11,18,9};
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) {
				sum=sum+a[i];
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("\nSum of Prime Numbers is Array is: "+ sum);
	}
	public static boolean isPrime(int n) {
		if(n<2)
			return false;
		if(n==2 || n==3)
			return true;
		if(n%2==0)
			return false;
		for(int j=3; j*j<n;j+=2) {
			if(n%j==0)
				return false;
		}
		return true;		
	}
}
