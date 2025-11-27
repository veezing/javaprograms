package digit_based_programs;
import java.util.Scanner;
public class PrimePalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start point: ");
		int start=sc.nextInt();
		System.out.println("Enter the end point: ");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++) {
			if(isPrime(i)&&isPalindrome(i)) {
				count++;
				System.out.print(i+" ");
			}	
		}
	System.out.println("\nTotal such numbers are: "+count);
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
	public static boolean isPalindrome(int n) {
		int rev=0;
		int originalNum=n;
		while(n>0) {
			int rem=n%10;
				rev=rev*10+rem;
		n/=10;
		}
	return rev==originalNum;	
	}

}
