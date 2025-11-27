package pattern_programming;

import java.util.Scanner;

public class Pattern11a {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n) {
		int num1=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i%2==1)
					System.out.print(num1+" ");
				num1++;
				}
			if(i%2==0) {
				int num2=n*i;
				for(int j=n;j>=1;j--) {
					System.out.print(num2+" ");
				num2--;
				}
			}
		System.out.println();	
		}
	}

}
