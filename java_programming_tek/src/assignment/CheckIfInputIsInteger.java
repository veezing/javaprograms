package assignment;

import java.util.Scanner;
public class CheckIfInputIsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        if (sc.hasNextInt()) 
            System.out.println("Thank you");
        else
            System.out.println("Invalid input");

        sc.close();
    }
}