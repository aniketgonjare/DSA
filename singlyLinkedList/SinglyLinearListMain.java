package com.singlyLinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void reverseList() {
    	Node oldhead=head;
    	head=null;
    	while(oldhead!=null)
    	{
    	//deleteing first node
    	Node temp=oldhead;
    	oldhead=oldhead.next;
    	
    	//adding it to the new Lists head
    	temp.next=head;
    	head=temp;
    	}
    	
    }
    

//    Node prev = null;
//    Node oldHead = head;
//    Node next = null;
//
//    while (oldHead != null) {
//        next = oldHead.next;
//        oldHead.next = prev;
//        prev = oldHead;
//        oldHead = next; 
//    }
//
//    head = prev;

      
    Node reverseList(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node rest = reverseList(node.next);
        node.next.next = node;
        node.next = null;

        return rest;
    }

    void reverse() {
        head = reverseList(head);
    }
    
    public void removeAllOccurances(int value)
    {
    	if(head==null)
    	{
    		return;
    	}
    	if(head.data==value)
    	{
    		head=head.next;
    	}
    	Node trav=head;
    	Node prev=head;
    	Node del=head;
    	
    	while(prev!=null)
    	{ 	
    	while(del.data!=value)
    	{
    		prev=del;
    		del=del.next;
    		if(del==null)
    		{
    			return;
    		}
    		
    	}
    	prev.next=del.next;
    	del=prev;
    	prev=prev.next;
    	}
    	
    	
    }
    
    public int CalculateLengthOfLinkedList()
    {
    	if(head==null)
    	{
    		return 0;
    	}
    	if(head.next==null)
    	{
    		return 1;
    	}
    	int count=0;
    	Node trav=head;
    	while(trav!=null)
    	{
    		trav=trav.next;
    		count++;
    	}
    	return count;
    }
    
    public int findMiddleElement()
    {
    	if(head==null)
    		return 0;
    	if(head.next==null)
    		return 1;
    	Node trav=head;
    	Node mid=head;
    	while(trav!=null && trav.next!=null)
    	{
    		trav=trav.next.next;
    		mid=mid.next;
    	}
    	return mid.data;
    }
    

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class SinglyLinearListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addNode(12);
        list.addNode(88);
        list.addNode(33);
        list.addNode(12);
        list.addNode(48);
        list.addNode(5);
        list.addNode(12);
        list.addNode(23);
        list.addNode(13);
        list.addNode(4);
        list.addNode(12);
        list.addNode(76);
        list.addNode(76);
        

        System.out.println("Original List:");
        list.display();

        list.reverseList();

        System.out.println("Reversed List:");
        list.display();
        
        
        list.reverse();
        System.out.println("Reversed By Recursive List:");
        list.display();
        
     
        list.removeAllOccurances(12);
        System.out.println("deleting all occurance of given number :");
        list.display();
        
        
        System.out.println("finding the length of singly linked list : ");
        System.out.println("length of singly linked list id : "+list.CalculateLengthOfLinkedList());
        
        
        System.out.println("finding mid element of a linked list : ");
        System.out.println(list.findMiddleElement());
    }
}