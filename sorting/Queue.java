 package com.sorting;

import java.util.Arrays;

public class Queue {
	
	private int front;
	private int rear;
	int[] QueueArray=new int[5];
	
	public Queue() {
		front=-1;
		rear=-1;
	}
	
	public boolean isFull()
	{
		return ((front==-1 && rear==QueueArray.length-1 ) || (front!=-1 && front==rear));
	}
	
	public boolean isEmpty()
	{
		return (front==rear && front==-1);
	}
	
	public void add(int data)
	{
		if(isFull())
		{
			System.out.println("Queue is full : ");
		}
		rear=(rear+1)%QueueArray.length;
		QueueArray[rear]=data;
	}
	
	public int delete()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty..!!");
		}
		int d=QueueArray[++front];
		QueueArray[front]=0;				
		return d;
	}
	
	public void display()
	{
		if(isEmpty())
			return;
		System.out.println(Arrays.toString(QueueArray));
	}
	
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		q.add(11);
		q.add(111);
		System.out.println("hh");
		q.display();
		System.out.println(q.delete());
		q.display();
		System.out.println(q.delete());
		q.display();
		System.out.println(q.delete());
		q.display();
		System.out.println(q.delete());
		q.display();
		
	}

}
