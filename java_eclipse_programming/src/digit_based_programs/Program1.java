package digit_based_programs;
//Print each digit one by one
import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		printDigits(n);	
	}
	public static void printDigits(int n) {
		for(int rem=0;n>0;n/=10) {
			rem=n%10;
			System.out.println(rem);
		}	

	}
}