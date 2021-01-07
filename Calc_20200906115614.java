class Stack{
	int storage[] = new int[10];
	int j=0;
	
	void push(int value){
		if(j<storage.length){
			storage[j]= value;
			j++;
		}
		else{
			System.out.println("Warning : OverFlow");
		}
	}
}
class Calc{
	public static void main(String args[]){
		Stack price = new Stack();
		Stack id = new Stack();
		id.push(1);
		id.push(2);
		id.push(3);
		id.push(4);
		id.push(5);
		id.push(6);
		id.push(7);
		id.push(8);
		id.push(9);
		id.push(10);
		id.push(11);
	
		//for(int i=0;i<id.j;i++)
		//	System.out.print(id.storage[i]+" ");
	}
}