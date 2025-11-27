package switch_case;

import java.util.Scanner;

public class OperationsDriver {
	public static void main(String[] args) {
		Operations operation=new Operations();
		Scanner sc=new Scanner(System.in);
		char c;
		do{
			operation.selectOperation();
			System.out.println("Enter Y/y to continue...");
			c=sc.next().charAt(0);
		}while(c=='Y'||c=='y');
	System.out.println("Program Ends!!!");	
	}

}
