package org.example.StackandQueue.UsingLinkedList;

import org.example.StackandQueue.IStackQueue;

import java.util.ArrayList;

public class MyStackUsingLinkedList implements IStackQueue {

	Node topNode;

	MyStackUsingLinkedList() {
		this.topNode = null;
	}

	@Override
	public boolean push(int value) {
		//add first
		if (!isFull()) {
			Node newNode = new Node(value);
			newNode.next = topNode;
			topNode = newNode;
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		//delete first
		if (!isEmpty()) {
			int value = topNode.value;
			topNode = topNode.next;
			return value;
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		return topNode == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public void show() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		Node temp = topNode;
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		while(temp != null) {
			tempList.add(temp.value);
			temp=temp.next;
		}
		System.out.print("Stack : ");
		for (int i = tempList.size()-1;i>=0;i--){
			System.out.print(tempList.get(i)+" ");
		}
		System.out.println();
	}
}
