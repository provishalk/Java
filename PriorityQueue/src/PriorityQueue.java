import java.util.*;
public class PriorityQueue {
	int sizeOfArray = 5;
	int storage[] =  new int[sizeOfArray];
	char priority[]= new char[sizeOfArray];
	int start = -1;
	int rear = -1;
	void enqueue(int value,char p) {
		if(rear == sizeOfArray-1){
			System.out.print("Warning :: Queue is Full");
		}
		else if(start == -1 && rear == -1) {
			start = rear = 0;
			storage[start] = value;
			priority[start] = p;
		}
		else {
			rear++;
			storage[rear] = value;
			priority[rear] =p; 
		}
		
	}
	void display() {
		if(start == -1 && rear == -1) {
			System.out.print("\nWarning :: Queue is Empty");
		}
		else {
			for(int i = start;i<=rear;i++){
				System.out.print(storage[i]+""+priority[i]+" ");
				
			}
		}
			
	}
	void rearrange(int head,int tail){
		
		while(tail>head){
			storage[tail]=storage[tail-1];
			priority[tail]=priority[tail-1];
			tail--;
		};
		start++;
	}
	void dequeue() {
		if(start == -1 && rear == -1) {
			System.out.print("Warning :: Queue is Empty");
		}
		else if(start==rear) {
			System.out.println("Removied element is : "+storage[start]);
			start = -1;
			rear = -1;
		}
		else {
			boolean temp = true;
			for(int i=start;i<=rear;i++)
				if(priority[i]=='h' || priority[i]=='H'){
					System.out.println("Removied element is : "+storage[i]);
					rearrange(start, i);
					temp = false;
					break;
				}
			if(temp){
				System.out.println("Removied element is : "+storage[start]);
				start++;
			}
			
		}
	}
	void peek() {
		if(start == -1 && rear == -1) {
			System.out.print("Warning :: Queue is Empty");
		}
		else {
			boolean temp = true;
			for(int i=start;i<=rear;i++)
				if(priority[i]=='h' || priority[i]=='H'){
					System.out.println("First element is : "+storage[i]);
					temp = false;
					break;
				}
			if(temp){
				System.out.println("First element is : "+storage[start]);
			}
			
		}
	}

	public static void main(String[] args) {
		PriorityQueue list = new PriorityQueue();
		Scanner input = new Scanner(System.in);
		int x,value;
		char c;
		do {
			System.out.println();
			System.out.println("Enter Value to perform action:");
			System.out.println("1: TO Enter value in Queue");
			System.out.println("2: To Remove value from Queue");
			System.out.println("3: To Display All Elements of Queue");
			System.out.println("4: TO See First Element in Queue");
			System.out.println("Any Other Value to Exit");
			System.out.print("Enter :-");
			x=input.nextInt();
			
			switch(x) {
			case 1:
				System.out.print("Value:");
				value = input.nextInt(); 
				System.out.print("Enter Priority(H or L):");
				c=input.next().charAt(0);
				list.enqueue(value,c); 
				break;
			case 2:
				list.dequeue();
				break;
			case 3:
				list.display();
				break;
			case 4:
				list.peek();
				break;
			}
		}while(x>=1 && x<=4);
	}

}
