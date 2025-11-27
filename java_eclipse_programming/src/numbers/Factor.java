package numbers;
//Print and count all the factors of a number(number itself not included)
import java.util.Scanner;
public class Factor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		getFactor(n);
		
	}
	
	public static void getFactor(int n) {
		int count=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
			count++;
			System.out.print(i+" ");
			}
		}
	System.out.println("\nTotal factors of "+n+" are "+count);
	}
}
