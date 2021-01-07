import java.util.Scanner;
class Stack{
	int storage[] = new int[50];
	int top=0;
	//Puch method to enter value in stack;
	void push(int value){
		if(top<storage.length){
			storage[top]= value;
			top++;
		}
		else{
			System.out.println("Warning : OverFlow");
			System.exit(0);
		}
	}
	//pop Method to remove last value in stack and removeit from stack;
	int pop(){
		int temp=0;
		if(top==0){
			System.out.println("Warning : UnderFlow");
			System.exit(0);
			
		}
		else{
			top--;
			temp = storage[top];
			storage[top]=0;	
		}
		return temp;
	}
	//Display method to dispay all the value of stack;
	void display(){
		if(top>0){
			for(int i=0;i<top;i++){
				System.out.print(storage[i]+" ");
			}
		}
		else{
			System.out.print("Warning : StackIsEmpty");
			System.exit(0);
		}
	}
	//Peek peek method used to see the value at top of stack;
	int peek(){
		if(top==0){
			System.out.println("Warning : StackIsEmpty");
			System.exit(0);
		}
		else{
			return storage[top-1];
		}
		return 0;
	}
}
class Calc{
	public static void main(String args[]){
		Stack id = new Stack();
		Scanner in = new Scanner(System.in);
		boolean check = true;		 
		while(check){
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.DISPLAY");
			System.out.println("4.PEEK");
			System.out.println("---any other number to exit---");
			System.out.println("");
			int choice = in.nextInt();
			switch(choice){
				case 1: System.out.println("Enter the number to input");
					int num = in.nextInt();
					id.push(num);
					break;
				case 2:
					id.pop();
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
