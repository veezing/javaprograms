package digit_based_programs;
//Get digit greater than or equal to 5
import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		getDigitAbove5(n);
	}
	public static void getDigitAbove5(int n) {
		for(int rem=0;n>0;n/=10) {
			rem=n%10;
			if(n%10>=5)
				System.out.println(rem);
		}
	}

}
