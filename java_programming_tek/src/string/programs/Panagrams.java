package string.programs;

import java.util.HashSet;

public class Panagrams {
	public static void main(String[] args) {
		String s = "\"The quick brown fox jumps over the lazy dog\"";
		String s1 = s.toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
		for(int i= 0; i<s.length();i++) {
			char c = s1.charAt(i);
			if(Character.isAlphabetic(c))
				set.add(c);
				
		}
		if(set.size()==26)
			System.out.println(s+" is A Panagram");
		else
			System.out.println(s+" is NOT a Panagram");
		
	}

}
