package pattern_programming;

import java.util.Scanner;

public class NumberTriangle1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number of Rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n)//n is no of rows
	{
		int star=n, space=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");
			for(int j=1;j<=star;j++)
				System.out.print(j+" ");
		star--; space++;
		System.out.println();
		}
	}

}
