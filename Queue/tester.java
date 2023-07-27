package com.Queue;

public class tester {
	public static void main(String[] args) {
		Queue q=new Queue(10);
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		q.display();
		
		System.out.println(q.peek());
		System.out.println(q.size());
		q.dequeue();
		System.out.println(q.peek());
		System.out.println(q.size());
		q.display();
		
		int peek=q.peek();
		System.out.println(peek);
		q.display();
		
	
	}
	

}
