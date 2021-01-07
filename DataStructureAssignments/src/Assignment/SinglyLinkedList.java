package Assignment;

import java.util.Scanner;

public class SinglyLinkedList {
	SinglyLinkedListNode head;
	static class SinglyLinkedListNode{
		int value;
		SinglyLinkedListNode next;
		SinglyLinkedListNode(int value){
			this.value=value;
			next = null;
		}
	}
	void insert(int value) {
		SinglyLinkedListNode toAdd = new SinglyLinkedListNode(value);
		if(head==null) {
			head = toAdd;
			return;
		}
		else {
			SinglyLinkedListNode temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = toAdd;
		}
		
	}
	void traversal() {
		SinglyLinkedListNode temp = head;
		while(temp.next!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println(temp.value);
	}
	void help() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Select to Perform action in singly  linked list");
		System.out.println("1. Insert Node.");
		System.out.println("2. Insert At First Position.");
		System.out.println("3. Delete Node.");
		System.out.println("4. traversal");
		System.out.println("5. Exit");
		int exit = 0;
		while(exit != 1) {
			switch(scan.nextInt()){
			case 1 : 
					System.out.println("Enter value:");
					insert(scan.nextInt());
					break;
			case 4 : 
					System.out.println("All elements of linked list are:");
					traversal();
					break;
			case 5 :
					exit = 1;
					break;
							
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList obj = new SinglyLinkedList();
		for(int i=11;i<=20;i++) {
			obj.insert(i);
		}
		obj.help();
		
//		System.out.println(obj.head.value);
	}

}
