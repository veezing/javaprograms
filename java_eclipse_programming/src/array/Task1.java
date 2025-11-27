package array;

import java.util.Scanner;

public class Task1 {
	//WAJP to store 5 inputs from user in the integer array
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter element number "+(i+1)+": ");
			arr[i] = sc.nextInt();	
		}
		System.out.println("====All Elements Are====");
		for(int a: arr) {
			System.out.print(a+" ");
		}
	}

}
