package switch_case;

import java.util.Scanner;

public class Operations{
	public void selectOperation() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1==> For Factorial");
		System.out.println("Enter 2==> To Get Power");
		System.out.println("Enter 3==> To Check Prime Number");
		System.out.println("Enter 4==> To Reverse Number");
		System.out.println("Enter 5==> To Check Palindrome");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("You have Selected Factorial Operation");
			System.out.println("Enter The Number: ");
			int n=sc.nextInt();
			int factorial=getFactorial(n);
			System.out.println(n+"!="+factorial);
			break;
		case 2:
			System.out.println("You have Selected Power Operation");
			System.out.println("Enter The value of a: ");
			int a=sc.nextInt();
			System.out.println("Enter The value of b: ");
			int b=sc.nextInt();
			int power=getPower(a, b);
			System.out.println(a+" to the power "+b+" is: "+power);
			break;
		case 3:
			System.out.println("You have Selected Prime Number Operation");
			System.out.println("Enter The Number: ");
			int p=sc.nextInt();
			if(isPrime(p))
				System.out.println(p+" is a Prime Number");
			else
				System.out.println(p+" is NOT a Prime Number");
			break;
		case 4:
			System.out.println("You have Selected Reverse Number Operation");
			System.out.println("Enter The Number: ");
			int x=sc.nextInt();
			int reverse=getReverse(x);
			System.out.println("Reverse of "+x+" is: "+reverse);
			break;
		case 5:
			System.out.println("You have Selected Palindrome Number Operation");
			System.out.println("Enter The Number: ");
			int y=sc.nextInt();
			if(y==getReverse(y))
				System.out.println(y+" is a Palindrome Number");
			else
				System.out.println(y+" is NOT a Palindrome Number");
			break;
		default:
			System.out.println("Invalid Operation Selected!! Select from Valid Options.");
			selectOperation();
		}

	}
	private int getFactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
			fact*=i;
		return fact;
	}
	private int getPower(int a, int b) {
		int pow=1;
		for(int i=1;i<=b;i++)
				pow*=a;
		return pow;
	}
	private boolean isPrime(int n) {
		if(n<2)
			return false;
		if(n==2||n==3)
			return true;
		if(n%2==0)
			return false;
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0)
			return false;
		}
		return true;
	}
	private int getReverse(int n) {
		int rev=0; 
		while(n>0) {
			int rem=n%10;
			rev=10*rev+rem;
		n=n/10;	
		}
	return rev;
	}
}
