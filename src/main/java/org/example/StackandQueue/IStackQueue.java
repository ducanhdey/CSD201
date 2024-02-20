package org.example.StackandQueue;

public interface IStackQueue {
//TODO : implement IStackQueue by Array or LinkedList
	public boolean push(int value);
	public int pop();
	public boolean isEmpty();
	public boolean isFull();
	public void show();
}
