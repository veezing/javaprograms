package numbers;
import java.util.Scanner;
public class PrimeNumberInRange1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start Point: ");
		int start=sc.nextInt();
		System.out.println("Enter the End Point: ");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<end;i++) {
			if(isPrime(i)&&isPrime(getSum(i))) {
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println("\nTotal Such Numbers are: "+count);
	}
	public static boolean isPrime(int n) {
		if(n<2)
			return false;
		if(n==2||n==3)
			return true;
		if(n%2==0)
			return false;
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0)
				return false;
		}
return true;
	}
	public static int getSum(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
		n/=10;	
		}
	return sum;
	}

}
