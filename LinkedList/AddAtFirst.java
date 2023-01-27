package com.programs;

public class LinkedList {
	class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public Node head =null;
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head= newNode;
			return;
		}
		newNode.next=head;
		head = newNode;
	}
	public void display()
	{
		Node curr= head;
		if(head == null)
		{
			System.out.println("LinkedList is empty");
			
		}
		while(curr!=null)
		{
			System.out.print(curr.data+ " ");
			curr=curr.next;
		}
		System.out.println("null");
	}
	public static void main(String args[]) {
		LinkedList l= new LinkedList();
		l.addFirst(2);
		l.addFirst(3);
		l.addFirst(4);
		l.addFirst(6);
		l.addFirst(16);
		l.display();
		
	}

}
