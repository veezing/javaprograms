package numbers;
//Generate 'nth' Fibonacci Term
import java.util.Scanner;
public class NthFibonacciTerm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Term: ");
		int n=sc.nextInt();
		System.out.println("Required Term is "+getNthFibonacci(n));
	}
	
	public static int getNthFibonacci(int n) {
		if(n==1)
			return 0;
		int a=0;
		int b=1;
		int c=1;
		for (int i=1;i<=n-2;i++) {
			c=a+b;
			a=b;
			b=c;
		}
	return c;
	}
}