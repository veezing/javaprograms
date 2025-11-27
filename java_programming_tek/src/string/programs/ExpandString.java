package string.programs;

public class ExpandString {
	public static void main(String[] args) {
		String s = "a2b2a1b1a1c1";
		for(int i=0; i<s.length();i+=2) {
			char c = s.charAt(i);
			int count = s.charAt(i+1)-48;
			for(int j=1;j<=count;j++) {
				System.out.print(c);
			}
		}
	}

}
