package digit_based_programs;
import java.util.Scanner;
public class AlternatePrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start Point: ");
		int start=sc.nextInt();
		System.out.println("Enter the End Point: ");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				count++;
				if(count%2==1)
					System.out.print(i+" ");
			}
		}
		System.out.println();
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				count++;
				if(count%2==0)
					System.out.print(i+" ");
			}
		}
	}
	public static boolean isPrime(int n) {
		if(n<2)
			return false;
		if(n==2||n==3)
			return true;
		if(n%2==0)
			return false;
		for(int i=3;i*i<n;i+=2) {
			if(n%i==0)
				return false;
		}
	return true;
	}
}