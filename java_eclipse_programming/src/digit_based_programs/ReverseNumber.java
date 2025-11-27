package digit_based_programs;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		System.out.println("Reverse Number is: "+reverse(n));

	}
	
	public static int reverse(int n) {
		int rev=0; 
		while(n>0) {
			int rem=n%10;
			rev=10*rev+rem;
		n=n/10;	
		}
	return rev;
	}
}
