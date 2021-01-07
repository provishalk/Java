package firstclass;

public class Testing {

	private int english;
	private int hindi;
	private int maths;
	void english(int temp){
		english = temp;
	}
	void hindi(int temp){
		hindi= temp;
	}
	void maths(int temp){	
		maths = temp;
	}
	void totalMarks() {
		System.out.print("Total marks of all subjects are:"+(english+hindi+maths));
	}
	public static void main(String[] args) {
		Testing stu1 = new Testing();
		stu1.english(10);
		stu1.hindi(20);
		stu1.maths(30);
		stu1.totalMarks();
	}

}
