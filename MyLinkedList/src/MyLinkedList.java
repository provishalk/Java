
public class MyLinkedList {
	Node head;
	void insertLast(int value) {
		Node toAdd = new Node(value);
		if(head==null){
			head = toAdd;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = toAdd;
		
	}
	void insertFirst(int value) {
		Node toAdd = new Node(value);
		if(head==null){
			head = toAdd;
			return;
		}
		else {
			toAdd.next=head;
			head = toAdd;
		};
	}
	void triverse() {
		Node temp = head;
			while(temp!=null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
			
	}
	/*
	 * This Will delete the position on node
	 * void delete(int pos) {
		if(this.countNode()<=pos) {
			System.out.println("Linkedlist dont have enught Elements");
			return;
		}
		if(pos<0)
			return;
		Node temp = head;
		Node temp1;
		if(pos==0) {
			head = head.next;
			return;
		}
		for(int i=0;i<pos-1;i++){
			temp=temp.next;
		}
		temp1 = temp.next;
		temp.next = temp1.next;
	}*/
	void delete(int value) {
		Node temp = head;
		if(temp.value == value) {
			head = temp.next;
		}
		else {
			while(temp.next.value!=value){
				temp = temp.next;
				if(temp.next.next==null)
					break;
			}
			if(temp.next.value==value)
				temp.next = temp.next.next;
		}
	}
	static class Node{
		int value;
		Node next;
		public Node(int x) {
			value = x;
			next = null;
		}
	}
	//This Method count the no. of node avi
	int countNode() {
		int x=0;
		Node temp = head; 
			if(head==null)
				return x;
			else {
				while(temp!=null) {
					x++;
					temp = temp.next;
				}
			}
		return x;
	}
	void insertMid(int x,int pos) {
		if(this.countNode()<=pos) {
			System.out.println("Linkedlist dont have enught Elements");
			return;
		}
		if(pos<0)
			return;
		Node toAdd = new Node(x);
		Node temp = head;
		if(pos==0) {
			this.insertFirst(x);
			return;
		}
		for(int i=0;i<pos-1;i++){
			temp=temp.next;
		}
		toAdd.next = temp.next;
		temp.next = toAdd;
	}
	void update(int x,int pos) {
		if(this.countNode()<=pos) {
			System.out.println("Linkedlist dont have enught Elements");
			return;
		}
		if(pos<0)
			return;
		Node temp = head;
		if(pos==0) {
			temp.value = x;
			return;
		}
		for(int i = 0; i<pos; i++){
			temp=temp.next;
		}
		temp.value = x;
	}
	public static void main(String[] args) {
		MyLinkedList obj = new MyLinkedList();
		obj.insertLast(10);
		obj.insertLast(11);
		obj.insertLast(12);
		obj.insertLast(13);
		obj.insertLast(14);
		obj.insertLast(15);
		obj.delete(1733);
		obj.triverse();
		
	}
}
