package interviewprograms;

import java.util.*;

public class LongestSubstring {
	public static void main(String[] args) {
		String s = "shubham";
		int start = 0, max = 0, toStart = 0;

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch) && map.get(ch) > start)
				start = map.get(ch) + 1;
			map.put(ch, i);
			if(i-start+1>max) {
				max=i-start+1;
				toStart=start;
			}
		}
		System.out.println(s.substring(toStart, toStart+max));
	}

}
