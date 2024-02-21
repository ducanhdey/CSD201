package org.example.StackandQueue.Problem;

import java.util.Scanner;
import java.util.Stack;

public class Prob20 {
	public static boolean isValid(String s) {

		Stack<Character> myStack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				myStack.push(c);
			} else {
				if(myStack.isEmpty()) {
					return false;
				}
				char openPeek = myStack.peek();
				if (c == ')' && openPeek == '('
						|| c == '}' && openPeek == '{'
						|| c == ']' && openPeek == '[') {
					myStack.pop();

				} else {
					return false;
				}
			}
		}
		return myStack.isEmpty() ? true : false;
	}

	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		System.out.println(isValid(s));
	}

}

