package org.example.StackandQueue.UsingLinkedList;

import org.example.StackandQueue.IStackQueue;

public class MyQueueUsingLinkedList implements IStackQueue {
	Node head;
	Node tail;

	MyQueueUsingLinkedList() {
		this.head = this.tail = null;
	}

	@Override
	public boolean push(int value) {
		//add last
		if (!isFull()) {
			Node newNode = new Node(value);
			if (isEmpty()) {
				head = tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		//delete first

		if (!isEmpty()) {
			if (head == tail) { // if stack has only one element
				head = tail = null;
			} else {
				int value = head.value;
				head = head.next;
				return value;
			}
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		return head == null && tail == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public void show() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}else{
			Node temp = head;
			System.out.print("Queue : ");
			while (temp != null){
				System.out.print(temp.value+" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
