package thursday2703;

public class Task2 {
	static int i;
	//WAJP to print all prime integers from the above array
	public static void main(String[] args) {
		int[] a= {1,-3,4,6,7,-3,5,11,18,9};
		for(i=0;i<a.length;i++) {
			if(isPrime(a))
				System.out.println(a[i]);
		}	
	}
	public static boolean isPrime(int[] a) {
		if(a[i]<2)
			return false;
		if(a[i]==2 || a[i]==3)
			return true;
		if(a[i]%2==0)
			return false;
		for(int j=3; j*j<a[i];j+=2) {
			if(a[i]%j==0)
				return false;
		}
		return true;		
	}
}
