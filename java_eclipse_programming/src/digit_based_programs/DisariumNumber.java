package digit_based_programs;

import java.util.Scanner;

public class DisariumNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
	
		if(isDisarium(n)) 
			System.out.println(n+" is a Disarium Number");
		else
			System.out.println(n+" is NOT a Disarium Number");
	}
	public static boolean isDisarium(int n) {
		int sum=0; 
		int originalNum=n;
		int count=getCount(n);
			while(n>0) {
				int rem=n%10;
				sum+=getPower(rem, count);
			count--;
			n=n/10;
			}
	return sum==originalNum;		
	}
	public static int getCount(int n) {
		int count=0;
		while(n>0) {
			count++;
		n=n/10;	
		}
	return count;
	}
	public static int getPower(int a, int b) {
		int pow=1;
		for(int i=1;i<=b;i++) {
			pow*=a;
		}
	return pow;	
	}
}
