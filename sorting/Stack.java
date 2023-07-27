package com.sorting;

import java.util.Arrays;

public class Stack {
	public int top;
	int[] stack=new int[5];
	
	public Stack() {
		top=-1;
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	
	public boolean isFull()
	{
		if(stack.length-1==top)
			return true;
		return false;
	}
	
	public void push(int n)
	{
		if(isFull())
		{
			System.out.println("stack is overflow..!! \n stack is full");
			return;
		}
			top++;
		stack[top]=n;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is underflow \n stack is empty");
			return -1;
		}
		stack[top--]=0;
		return stack[top];
		
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("stack is underflow \n stack is empty");
			return -1;
		}
		return stack[top];
	}
	
	
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(20);
		s.push(25);
		s.push(30);
		
		System.out.println("original stack elements "+Arrays.toString(s.stack));
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		
		
		System.out.println("after pop operations "+Arrays.toString(s.stack));
	}
	
	
	

}
