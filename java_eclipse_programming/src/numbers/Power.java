package numbers;
//Print the Power of a to b
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int a=sc.nextInt();
		System.out.println("Enter Power: ");
		int b=sc.nextInt();
		System.out.println(a+" to the power "+b+" is: "+getPower(a,b));
		
	}
	public static int getPower(int a, int b) {
		int pow=1;
		for(int i=1;i<=b;i++)
				pow*=a;
		return pow;
	}
	
}	