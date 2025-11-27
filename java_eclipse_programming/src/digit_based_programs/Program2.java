package digit_based_programs;
//Print only even digits
import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		getEvenDigits(n);
	}
	public static void getEvenDigits(int n) {
		for(int rem=0;n>0;n/=10) {
				rem=n%10;
			if(n%2==0)
				System.out.println(rem);
		}
		
	}

}
