package digit_based_programs;
import java.util.Scanner;

public class PalindromeInRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start Point");
		int start=sc.nextInt();
		System.out.println("Enter the End Point");
		int end=sc.nextInt();
		int count=0;
		
		for(int i=start;i<=end;i++) {
			if(isPalindrome(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nTotal Palindrome Numbers are: "+count);	
	}
	
	public static boolean isPalindrome(int n) {
		int rev=0;
		int originalNum=n;
		
		while(n>0) {
			rev=10*rev+n%10;
		n=n/10;
		}
	return rev==originalNum;	
	}
}
