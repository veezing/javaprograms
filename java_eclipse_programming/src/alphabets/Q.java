package alphabets;

import java.util.Scanner;

public class Q {
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
				if(i==1&&j!=n-1&&j!=1&&j!=n||i==n-1&&j!=1&&j!=n||j==1&&i!=1&&i!=n-1&&i!=n||j==n-1&&i!=1&&i!=n||i==n-2&&j==n-2||i==n&&j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.println();	
		}
	}

}
