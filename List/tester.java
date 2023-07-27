package com.List;

public class tester {

	public static void main(String[] args) {
		DoublyLinkedList dll=new DoublyLinkedList();
		
		Student stud1=new Student(1,"aniket");
		Student stud2=new Student(2,"sham");
		Student stud3=new Student(3,"utki");
		Student stud4=new Student(4,"nakli");
		Student stud5=new Student(5,"shubham");
		Student stud6=new Student(6,"darshan");
				
		System.out.println("Doubly linked list after adding at node:");
		dll.insert(stud1);
		dll.insert(stud2);
		dll.insert(stud3);
		dll.insert(stud4);		
		dll.display();
		
		System.out.println("Doubly Linked List after adding node at first:");
		dll.insertAtFirst(stud5);	
		dll.display();
		
		

		System.out.println("reversed linked list :");
		dll.ReverseDisplay();
		System.out.println("''''''''''");
		
		
		System.out.println("Doubly Linked List after adding node at position:");
		dll.insertAtPosition(stud6, 4);
		dll.display();
		
		
		System.out.println("doubly lilnked list after deleting last Node");
		dll.deleteLast();
		dll.display();
		
		System.out.println("doubly lilnked list after deleting first Node");
		dll.deleteFirst();
		dll.display();
		
		System.out.println("doubly lilnked list after deleting element at positio");
		dll.deleteAtPosition(3);
		dll.display();
		
		
		System.out.println("reversed linked list :");
		dll.ReverseDisplay();
		
		System.out.println();
		System.out.println("result after recursion display:");
		dll.recDisplay();
		
		
		
		
		
		

	}

}
