package array;

public class Task2 {
	//WAJP to find even elements from the integer array
	
	public static void main(String[] args) {
		int[] a = {11,20,56,99,78,13};
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}

}
