package thursday2703;

public class Task6 {
//WAJP to print first & last letter of each name
	public static void main(String[] args) {
		String[] s = {"java","eclipse", "ajax", "python", "php", "sql", "javascript"};
		for(int i = 0; i<s.length; i++) {
			char c1 = s[i].charAt(0);
			char c2 = s[i].charAt(s[i].length()-1);
				System.out.println(c1+"    "+c2);
		}
		
	}
}
