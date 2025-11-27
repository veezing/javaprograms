package numbers;
//Print factorial of a Number
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		System.out.println(n+"! = "+getFactorial(n));
		
	}
	
	public static int getFactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		return fact;
	}

}