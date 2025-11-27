package thursday2703;

import java.util.Scanner;

public class Task7 {
//WAJP to print first & last letter of each name
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String s1 = sc.next(); 
		
		String[] s = {"java","eclipse", "ajax", "python", "php", "sql", "javascript"};
		for(int i = 0; i<s.length; i++) {
			if(s[i].equalsIgnoreCase(s1))
				System.out.println("Name is Present");
		}
	}
}
