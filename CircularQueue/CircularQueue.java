import java.util.*;
class CircularQueue{
	int start = -1;
	int rear = -1;
	int arraySize=5;
	int storage[] = new int[arraySize];
	void enqueue(int value){
		if(start == -1 && rear == -1){
			start++;
			rear++;
			storage[rear]=value;
		}
		else if((rear+1)%arraySize==start){
			System.out.println("\nQueue is Full:Overflow\n");
			
		}
		else{
			
			rear = (rear+1)%arraySize;
			storage[rear]=value;
			
		}
	}
	void dequeue(){
		if(start == -1 && rear == -1){
			System.out.println("Queue is Empty");
		}
		else if(start==rear){
			System.out.println("Dequeued Element Is:"+storage[start]);
			start = rear = -1;	
		}
		else{
			System.out.println("Dequeued Element Is:"+storage[start]);
		    start = (start+1)%arraySize;
		}
	}
	void display(){
			int temp=start;
			if(start == -1 && rear == -1){
				System.out.println("Queue is Empty");
			}
			else{
				
				while(temp!=rear){
					System.out.print(storage[temp]+" ");
					temp = (temp+1)%arraySize;	
				}
				System.out.println(storage[rear]);
			
			}
		}
	void peek(){
		if(start == -1 && rear == -1){
				System.out.println("Queue is Empty");
			}
			else{
				System.out.println("First Element is:"+storage[start]);
			}
	}
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		CircularQueue obj = new CircularQueue();
		
		int input,x;
		do{
			System.out.println("Enter Value to perform action:");
			System.out.println("1: TO Enter value in Queue");
			System.out.println("2: To Remove value from Queue");
			System.out.println("3: To Display All Elements of Queue");
			System.out.println("4: TO See First Element in Queue");
			System.out.println("Any Other Value to Exit");
			System.out.print("Enter :-");
			input = scan.nextInt();
			System.out.println();
			switch(input){
				case 1: System.out.print("Enter Value :");
						x = scan.nextInt();
						System.out.println();
						obj.enqueue(x);
						break;
				case 2: obj.dequeue();
						break;
				case 3: obj.display();
						break;
				case 4: obj.peek();
						break;
			}
		}while(input>=1 && input<=4);
		
		switch(input){
			
		}
		
		
	}
}