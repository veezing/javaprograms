package numbers;
//Generate 'n' terms of Fibonacci Series
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Required Number of Terms: ");
		int n=sc.nextInt();
		getFibonacci(n);
	}
	
	public static void getFibonacci(int n) {
		if(n==1) {
			System.out.println(0);
		}	
		else {
			int a=0;
			int b=1;
			System.out.print(a+" "+b);
			
			for (int i=1;i<=n-2;i++) {
				int c=a+b;
				System.out.print(" "+c);
					a=b;
					b=c;
			}
		}
	}
}