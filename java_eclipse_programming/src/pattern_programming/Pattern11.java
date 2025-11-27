package pattern_programming;
import java.util.Scanner;
public class Pattern11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n) {
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(num+" ");
				num++;
			}
		System.out.println();	
		}
	}
}