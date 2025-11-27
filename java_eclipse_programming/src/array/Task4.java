package array;

public class Task4 {
	//WAJP to find vowel from character array
	public static void main(String[] args) {
		char[] c= {'a','b','t','y','u','r'};
		for(int i =0;i<c.length;i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
				System.out.print(c[i]+" ");
			}
		}
		
		
	}

}
