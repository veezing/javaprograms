package string.programs;

public class AllPossibleSubstrings {
	public static void main(String[] args) {
		String s = "sum";
		for(int i =0; i<s.length();i++) {
			for(int j = i+1; j<=s.length(); j++) {
				String s1 = s.substring(i, j);
				System.out.println(s1);
				
			}
		}
	}

}
