package thursday2703;

public class Task5 {
//WAJP to print names whose first name starts with vowel
	public static void main(String[] args) {
		String[] s = {"java","eclipse", "ajax", "python", "php", "sql", "javascript"};
		for(int i = 0; i<s.length; i++) {
			char c = s[i].charAt(0);
			if(c=='a'||c =='e'||c =='i'||c =='o'||c=='u')
				System.out.println(s[i]);
		}
		
	}
}
