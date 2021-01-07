import java.util.Scanner;

class Queue{
	int storage[] = new int[10];
	int start = 0;
	int rear = 0;
	void enqueue(int value){
		if(rear<storage.length){
			storage[rear] = value;
			rear++;
		}
		else{
			System.out.println("Warning : OverFlow");
			System.exit(0);
		}
		
	}
	int dequeue(){
		int temp=0;
		//System.out.println(rear+" "+storage[rear-1]);
		if(rear==start){
			System.out.println("Warning : Underflow");
			System.exit(0);
		}
		else{
			temp = storage[start];
			storage[start]=0;
		}
		for(int i=0;i<rear;i++){
			storage[i]=storage[i+1];
		}
		rear--;
		return temp;	
	}
	void display(){
		if(rear>0){
			for(int i=0;i<rear;i++){
				System.out.println(storage[i]);
			}
		}
		else{
			System.out.print("Warning : QueueIsEmpty");
			System.exit(0);
		}
		
	}
	int peek(){
		int temp = 0;
		if(rear>0){
				temp = storage[start];
			}
		else{
			System.out.print("Warning : QueueIsEmpty");
			System.exit(0);
		}
		return temp;
	}
		
	public static void main(String arg[]){
		Queue id = new Queue();
		Scanner in = new Scanner(System.in);
		boolean check = true;		 
		while(check){
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Show");
			System.out.println("4.Peek");
			System.out.println("---any other number to exit---");
			System.out.println("");
			int choice = in.nextInt();
			switch(choice){
				case 1: System.out.println("Enter the number to input");
					int num = in.nextInt();
					id.enqueue(num);
					break;
				case 2:
					id.dequeue();
					break;
				case 3:
					id.display();
					break;
				case 4:
					System.out.println(id.peek());
					break;
				default: check = false;
					break;		
			}
		}
		
	}
}