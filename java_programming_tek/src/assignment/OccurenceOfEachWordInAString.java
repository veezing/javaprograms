package assignment;

import java.util.LinkedHashMap;

public class OccurenceOfEachWordInAString {
	public static void main(String[] args) {
		String [] s = {"banana","strawberry", "apple", "banana"};
		LinkedHashMap<String, Integer> hash = new LinkedHashMap<String, Integer>();
		for(String ch : s) {
			if(hash.containsKey(ch)) {
				hash.put(ch, hash.get(ch)+1);
				
			}else
				hash.put(ch, 1);
		}
		System.out.println(hash);
	}


}
