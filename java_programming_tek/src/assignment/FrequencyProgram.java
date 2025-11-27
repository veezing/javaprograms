package assignment;

import java.util.LinkedHashMap;

public class FrequencyProgram {
	public static void main(String[] args) {
		String s = "banana";
		LinkedHashMap<Character, Integer> hash = new LinkedHashMap<Character, Integer>();
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(hash.containsKey(c))
				hash.put(c, hash.get(c)+1);
			else
				hash.put(c, 1);
		}
		System.out.println(hash);
	}

}
