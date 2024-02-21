package org.example.StackandQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UsingLibrary {
	public static void main(String[] args)  {
//		Stack<Integer> stack = new Stack<Integer>();
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		stack.stream().forEach(System.out::print);
//		stack.pop();
//		System.out.println();
//		stack.stream().forEach(System.out::print);
//		System.out.println(stack.peek());

		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.stream().forEach(System.out::print);
		System.out.println();
		queue.remove();
		queue.stream().forEach(System.out::print);
		System.out.println();

		//poll
		System.out.println(queue.poll());
		queue.stream().forEach(System.out::print);
		//element
		System.out.println(queue.element());
		queue.stream().forEach(System.out::print);

	}
}
