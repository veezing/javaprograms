package digit_based_programs;
import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		do {
		System.out.println("Enter the Number: ");
	
		int n=sc.nextInt();
		if(isStrong(n))
			System.out.println(n+" is a Strong Number");
		else
			System.out.println(n+" is NOT a Strong Number");
		System.out.println("Enter Y/y to continue...");
		c=sc.next().charAt(0);
		}
		
		while(c=='Y'||c=='y') ;
		System.out.println("Program Ends");
		
	}
	public static boolean isStrong(int n) {
		int sum=0;
		int originalNum=n;
		while(n>0) {
			int rem=n%10;
			sum+=getFactorial(rem);
		n=n/10;
		}
	return sum==originalNum;
	}
	public static int getFactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		return fact;
	}	
}
