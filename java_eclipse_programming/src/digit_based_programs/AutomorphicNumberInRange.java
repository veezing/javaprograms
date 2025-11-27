package digit_based_programs;
import java.util.Scanner;
public class AutomorphicNumberInRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Starting Point: ");
		int start=sc.nextInt();
		System.out.println("Enter the End Point: ");
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++) {
			if(isAutomorphic(i)) {
				System.out.print(i+" ");
				count++;
			}
		}	
		System.out.println("\nTotal Armstrong Numbers are: "+count);
		
	}
	public static boolean isAutomorphic(int n) {
		int sum=0;
				sum=n*n;
	return n==sum%getPower(10, getCount(n));	
	}
	public static int getCount(int n) {
		int count=0;
		while(n>0) {
			count++;
		n=n/10;	
		}
	return count;
	}
	public static int getPower(int a, int b) {
		int pow=1;
		for(int i=1;i<=b;i++) {
			pow*=a;
		}
	return pow;	
	}
}
