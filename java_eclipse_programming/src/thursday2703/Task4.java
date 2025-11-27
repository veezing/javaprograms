package thursday2703;

public class Task4 {
//WAJP to print names with length less than 4
	public static void main(String[] args) {
		String[] s = {"java","eclipse", "ajax", "python", "php", "sql", "javascript"};
		for(int i = 0; i<s.length; i++) {
			if(s[i].length()<4)
				System.out.println(s[i]);
		}
		
	}
}
