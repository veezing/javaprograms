package alphabets;

import java.util.Scanner;

public class R {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n) {
		if(n%2==0) {
			System.out.println("The Rows must be odd");
			return;
		}
		int mid=n/2+1; int m=mid;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||i==1&&j<=mid||j==mid&&i<=mid||i==mid&&j<=mid||i>j&&i-j==n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.println();	
		}
	}
}
