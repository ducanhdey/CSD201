package org.example.StackandQueue.Problem;

import java.util.Stack;

public class Prob394 {
	public static String decodeString(String s) {
		Stack<Character> characters = new Stack<>();
		int n = s.length();

		for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if (c == ']') {
				//Pop until meet '['
				String loopString = "";
				while (characters.peek() != '[') {
					loopString = characters.pop() + loopString;
				}
				//remove '['
				characters.pop();
				//get number
				String number = "";
				while (characters.isEmpty() == false && Character.isDigit(characters.peek())) {
					number = characters.pop() + number;
				}
				int nLoop = Integer.parseInt(number);
				//repeat the string
				loopString = loopString.repeat(nLoop);
				//Add the result to stack
				for (int j = 0; j < loopString.length(); j++) {
					characters.push(loopString.charAt(j));
				}
			} else {
				characters.push(c);
			}
		}
		String result = "";
		while (characters.isEmpty() == false) {
			result = characters.pop() + result;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(decodeString("3[ab2[cc]]"));
	}

}
