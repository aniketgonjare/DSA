package com.List;

public class DoublyLinkedList {
	
	class Node{
		public Node next;
		public Node prev;
		public Object data;
		
		public Node(Object obj) {
			next=null;
			prev=null;
			data=obj;
		}
	}
	
	private Node head;
	
	public DoublyLinkedList() {
		head=null;
	}
	
	public void insert(Object obj)
	{
		Node newNode=new Node(obj);
		if(head==null)
		{
			head=newNode;
			return;
		}
		Node trav=head;
		while(trav.next!=null)
		{
			trav=trav.next;
		}
		
		newNode.prev=trav;
		trav.next=newNode;
		
		
	}
	
	public void insertAtFirst(Object obj)
	{
		Node newNode=new Node(obj);
		Node temp=head;
		if(head==null)
		{
			head=newNode;
			return;
		}
		newNode.next=head;
		
		head=newNode;
		temp.prev=newNode;
	}
	
	public void display()
	{
		if(head==null)
			return;
		Node trav=head;
		while(trav!=null)
		{
			System.out.println(trav.data);
			trav=trav.next;
		}
		System.out.println();
	}
	
	public void insertAtPosition(Object obj,int pos)
	{
		Node newNode=new Node(obj);
		if(pos<1 || (head==null && pos>1))
		{
			System.out.println("invalid position");
			return;
		}
		
		Node trav=head;
		
		for(int i=1;i<pos-1;i++)
		{
			trav=trav.next;
			
			if(trav==null)
			{
				System.out.println("invalid position ");
				return;
			}
		}
		
		newNode.prev=trav;
		newNode.next=trav.next;
		trav.next=newNode;
				
	}
	
	public void deleteLast()
	{
		if(head==null)
		{
			System.out.println("linked list is empty");
			return;
		}
		Node trav=head;
		while(trav.next.next!=null)
		{
			trav=trav.next;
		}
		trav.next=null;
	}
	
	public void deleteFirst()
	{
		if(head==null)
		{
			return;
		}
		head.next.prev=null;
		head=head.next;
			
	}
	
	public void deleteAtPosition(int pos)
	{
		if(pos<1 || (head==null && pos>1))
		{
			System.out.println("invalid position");
		}
		
		Node trav=head;
		
		for(int i=1;i<pos;i++)
		{
			trav=trav.next;
			if(trav.next==null)
				break;
		}
		trav.prev.next=trav.next;
		trav.next.prev=trav.prev;
	}
	
	public void ReverseDisplay()
	{
		if(head==null)
		{
			return;
		}
		Node trav=head;
		while(trav.next!=null)
		{
			trav=trav.next;
		}
		do
		{		
			System.out.println(trav.data);
			trav=trav.prev;		
		}while(trav!=null);
		
	}
	
	public void recDisplay(Node node)
	{
		if(node==null)
		{
			return ;
		}
		recDisplay(node.next);
		System.out.println(node.data);
	}
	
	public void recDisplay()
	{
		recDisplay(head);
	}
	
	
}
