package alphabets;

import java.util.Scanner;

public class A {
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
		int mid=n/2+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1&&j>1&&j<n||i==mid||j==1&&i>1||j==n&&i>1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.println();	
		}
	}

}
