package org.example.StackandQueue;

import java.util.Stack;

public class UsingLibrary {
	public static void main(String[] args)  {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.stream().forEach(System.out::print);
		stack.pop();
		System.out.println();
		stack.stream().forEach(System.out::print);
		System.out.println(stack.peek());

	}
}
