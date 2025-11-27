package pattern_programming;
import java.util.Scanner;

public class Pattern13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n||i==2||j==2||i==n-1||j==n-1)	
					System.out.print("* ");
				else
					System.out.print("  ");
			}	
		System.out.println();		
		}
	}

}
