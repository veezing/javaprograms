package digit_based_programs;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c;
		do {
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		if(isPalindrome(n))
			System.out.println(n+" is a Palindrome Number");
		else 
			System.out.println(n+" is NOT a Palindrome Number");
		System.out.println("Enter Y/y to continue...");
		c=sc.next().charAt(0);
		}
		
		while(c=='Y'||c=='y');
		System.out.println("Program Ends!!");
		}
		
	
	public static boolean isPalindrome(int n) {
		int originalNum=n;
		int rev=0; 
		while(n>0) {
			int rem=n%10;
			rev=10*rev+rem;
		n=n/10;	
		}
	return rev==originalNum;	
	}
}
