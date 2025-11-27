package digit_based_programs;
import java.util.Scanner;
public class BiggestDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		System.out.println("Biggest Digit is: "+getBiggestDigit(n));
	}
	public static int getBiggestDigit(int n) {
		int big=0;
		for(int rem=0;n>0;n/=10) {
			rem=n%10;
			if(rem>big)
				big=rem;
		}
		return big;
	}
}