package com.Queue;

import java.util.Arrays;

public class Queue {
	private int front;
	private int rear;
	private int capacity;
	private int size;
	private int[] arr;
	
	public Queue(int capacity) {
		this.capacity=capacity;
		this.arr=new int[capacity];
		this.front=-1;
		this.rear=-1;
		this.size=0;
	}
	
	public boolean isEmplty()
	{
		return size==0;
	}
	
	public boolean isFull()
	{
		return size==capacity;
	}
	
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("queue is full");
			throw new IllegalStateException();
		}
		
		if(isEmplty())
		{
		  front=0;
		}
		rear=(rear+1)%capacity;
		arr[rear]=data;
		size++;
	}
	
	public int dequeue()
	{
		if(isEmplty())
		{
			System.out.println("queue is empty you cannot poll!!!");
			throw new IllegalStateException();
		}
		
		int item=arr[front];
		arr[front]=0;
		front=(front+1)%capacity;
		size--;
		
		if(isEmplty())
		{
			rear=-1;
			front=-1;
		}
		return item;
	}
	
	public int peek()
	{
		if(isEmplty())
		{
			System.out.println("Queue is empty");
			return -1;
		}
		return arr[size];
	}
	
	public int size()
	{
		return size;
	}
	
	public void display()
	{
		if(isEmplty())
		{
			System.out.println("queue is empty");
			return;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
}
