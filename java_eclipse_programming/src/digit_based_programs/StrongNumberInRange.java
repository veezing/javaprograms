package digit_based_programs;

import java.util.Scanner;

public class StrongNumberInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Start Point: ");
		int start=sc.nextInt();
		System.out.println("Enter the End Point: ");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++) {
			if(isStrong(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
	System.out.println("\nTotal Strong Numbers are: "+count);
	}
	public static boolean isStrong(int n) {
		int sum=0; int originalNum=n;
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
