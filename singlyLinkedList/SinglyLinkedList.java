package com.singlyLinkedList;

class sinlgyList {

	class Node {
		private int data;
		private Node next;

		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}

	private Node head;

	public sinlgyList() {
		this.head = null;
	}

	public boolean add(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			return true;
		} else {
			Node prev = head;
			while (prev.next != null) {
				prev = prev.next;
			}
			prev.next = newNode;
			return true;
		}
	}

	public void delete(int val) {
		if (head != null) {
			Node trav = head;
			while (trav.next.data != val) {
				trav = trav.next;
				if (trav.next == null) {
					return;
				}
			}
			trav.next = trav.next.next;
		}
	}

	public void deleteByPos(int pos) {
		if (pos < 1 || (head == null && pos > 1)) {
			return;
		}

		if (pos == 1) {
			head = head.next;
		}

		Node prev = head;
		for (int i = 1; i < pos - 1; i++) {
			prev = prev.next;
			if (prev == null) {
				return;
			}
		}
		prev.next = prev.next.next;
	}

	public void insertBefore(int next, int val) {
		Node newNode = new Node(val);
		if (head == null) {
			return;
		}
		Node prev = head;
		while (prev.next.next.data != next) {
			prev = prev.next;
		}
		newNode.next = prev.next.next;
		prev.next.next = newNode;
	}

	public String checkDuplicate(int val) {
		String mesg = "duplicate Not found";
		Node trav = head;
		while (trav.next != null) {
			if (trav.data == val) {
				mesg = "duplicate key found";
			}
			trav = trav.next;
		}
		return mesg;
	}

	public void revDisplayRecurcive(Node trav) {
		if (trav == null) {
			return;
		}
		revDisplayRecurcive(trav.next);
		System.out.print(trav.data + "' ");
	}

	public void revDisplayRecurcive() {
		revDisplayRecurcive(head);
	}

	public void display(Node trav) {
		while (trav != null) {
			System.out.print(trav.data + ", ");
			trav = trav.next;
		}
		System.out.println();
	}

	public void display() {
		display(head);
	}
}

public class SinglyLinkedList {
	public static void main(String[] args) {
		sinlgyList s = new sinlgyList();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(70);
		s.add(60);
		s.display();
		
		s.insertBefore(50, 88);
		s.display();

		System.out.println(s.checkDuplicate(50));
		System.out.println(s.checkDuplicate(660));

		s.delete(30);
		s.delete(00);
		s.display();

		s.deleteByPos(2);
		s.display();

		s.deleteByPos(1);
		s.display();

		s.revDisplayRecurcive();		

	}

}
