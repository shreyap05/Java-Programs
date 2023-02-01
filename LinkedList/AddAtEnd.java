package com.programs;

import com.programs.LinkedList.Node;

public class LL {
	class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next= null;
		}
	}
	public Node head;
	
	void addLast(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
		}
		else {
			Node curr = head;
			while(curr.next!= null)
			{
				curr=curr.next;
			}
			curr.next= newNode;
		}
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
	}
	public static void main(String args[]) {
		LL l= new LL();
		l.addLast(2);
		l.addLast(3);
		l.addLast(4);
		l.addLast(6);
		l.addLast(16);
		l.addLast(112);
		l.display();

   }
}
