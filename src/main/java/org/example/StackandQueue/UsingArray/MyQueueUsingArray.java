package org.example.StackandQueue.UsingArray;

import org.example.StackandQueue.IStackQueue;

public class MyQueueUsingArray implements IStackQueue {
	private int[] array;
	private int SIZE;
	private int head;
	private int tail;

	MyQueueUsingArray(int size) {
		array = new int[size];
		SIZE = size;
		head = tail = -1;
	}

	@Override
	public boolean push(int value) {
		if (!isFull()) {
			if (isEmpty()) {
				head++;
			}
			tail++;
			array[tail] = value;
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		int value = -1;
		if (!isEmpty()) {
			value = array[head];
			head++;
			// Case the queue has one element
			if (head > tail) {
				//TODO:empty queue
				head = tail = -1;
			}
		}
		return value;
	}

	@Override
	public boolean isEmpty() {
		return head == -1 && tail == -1;
	}

	@Override
	public boolean isFull() {
		return tail == SIZE - 1;
	}

	@Override
	public void show() {
		if (isEmpty()) System.out.println("Queue is empty");
		else{
			System.out.print("Queue :");
			for (int i = head; i <= tail;i++){
				System.out.print(array[i]+" ");
			}
			System.out.println();
		}
	}

	public int count() {
		if (isEmpty()) return 0;
		else return tail - head + 1;
	}
}
