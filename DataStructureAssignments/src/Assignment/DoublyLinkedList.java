package Assignment;

public class DoublyLinkedList {
	DLLNode head;
	static class DLLNode{
		int value;
		DLLNode next;
		DLLNode pre;
		DLLNode(int val){
			value = val;
			next=null;
			pre= null;
		}
	}
	void insert(int value) {
		DLLNode toAdd = new DLLNode(value);
		if(head==null) {
			head = toAdd;
		}
		else {
			DLLNode temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
		temp.next = toAdd;
		toAdd.pre = temp;
		}
	}
	void traversal() {
		if(head==null) {
			return;
		} 
		else {
			DLLNode temp = head;
			while(temp.next!=null) {
				System.out.println(temp.value);
				temp = temp.next;
			}
			System.out.println(temp.value);
		}
	}
	void delete(int pos) {
		//pos stating from 0
		if(head==null) {
			System.out.println("Linked list is empty");
			return;
		}
		else if(pos == 0) {
			if(head.next==null) {
				head = null;
			}
			else {
				head.next.pre = null;
				head = head.next;
			}
			return;
		}
		DLLNode temp = head;
		for(int i=0;i<pos;i++) {
			temp = temp.next;
		}
		temp.next.pre = temp.pre;
		temp.pre.next =temp.next;
		
	}
	int size() {
		DLLNode temp = head;
		int size=0;
		while(temp.next!=null) {
			size++;
			temp = temp.next;
		}
		return size+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList obj = new DoublyLinkedList();
//		for(int i=1;i<=10;i++) {
//			obj.insert(i);
//		}
		obj.insert(15);
//		System.out.println(obj.head.next.next.pre.value);
		obj.delete(0);
		obj.delete(0);
		obj.traversal();
//		System.out.println(obj.size());
	}

}
