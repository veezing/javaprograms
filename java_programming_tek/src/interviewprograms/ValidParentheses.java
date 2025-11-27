package interviewprograms;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		String s = "([{}()])";
		
		Stack<Character> st = new Stack<>();
		
		for(int i = 0 ; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(st.size()>0 && ((ch==')' && st.peek()=='(') || (ch=='}' && st.peek()=='{') || (ch==']' && st.peek()=='[')))
				st.pop();
			else
				st.push(ch);
		}
		
		if(st.isEmpty())
			System.out.println(s+" is a Valid Parentheses");
		else
			System.out.println(s+" is an Invalid Parentheses");
	}

}
