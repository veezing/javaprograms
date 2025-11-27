package numbers;
//Check whether a no. is Perfect Number or not
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		if(isPerfect(n))
			System.out.println(n+" is a Perfect Number");
		else
			System.out.println(n+" is NOT a Perfect Number");
	}
	public static boolean isPerfect(int n){
		
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0)
				sum+=i;
		}
		return (sum==n);
	}

}