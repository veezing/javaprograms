package numbers;
import java.util.Scanner;
public class PrimeFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		getPrimeFactor(n);
	}
	public static void getPrimeFactor(int n) {
		int count=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0&&isPrime(i)) {
			count++;
			System.out.print(i+" ");
			}
		}
	System.out.println("\nTotal Prime factors of "+n+" are "+count);
	}
	public static boolean isPrime(int n) {
		if(n<2)
			return false;
		if(n==2||n==3)
			return true;
		if(n%2==0)
			return false;
		for(int i=3;i*i<=n;i+=2) {
			if (n%i==0)
				return false;
		}
	return true;
	}
}