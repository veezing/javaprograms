package digit_based_programs;
//Print only Odd Digits
import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		getOddDigits(n);
	}
	public static void getOddDigits(int n) {
		for(int rem=0;n>0;n/=10) {
			rem=n%10;
			if(n%2==1)
				System.out.println(rem);
		}
	}

}