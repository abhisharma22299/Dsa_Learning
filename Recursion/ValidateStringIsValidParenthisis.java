package Recursion;

import java.util.Stack;

public class ValidateStringIsValidParenthisis {
	public static char getVal(char ch) {
		switch (ch) {
		case ')':
			return '(';
		case ']':
			return '[';
		case '}':
			return '{';
		default:
			return ' ';
		}
	}

	public static boolean validateString(String str) {
		String opening = "({[";
		String closing = ")}]";
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (opening.indexOf(ch) != -1) {
				st.push(ch);
			}
			else {
				if(st.size()==0)return false;
				char temp=st.pop();
				if(getVal(ch)!=temp) {
					return false;
				}
			}
		}
		return st.size()==0;

	}

	public static void main(String[] args) {
		System.out.println(validateString("(){}{}"));
	}
}
