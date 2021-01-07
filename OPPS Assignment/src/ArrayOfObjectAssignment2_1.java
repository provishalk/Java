
public class ArrayOfObjectAssignment2_1 {
	String USN;
	String name;
	//Marks
	float hindi,english,mathematics;
	public ArrayOfObjectAssignment2_1(String RegNo,String Name) {
		// TODO Auto-generated constructor stub
		name = Name;
		USN = RegNo;
	}
	void assignMarks(float hin,float eng,float maths) {
		hindi = maths;
		english = eng;
		mathematics = maths;
	}
	static void display(ArrayOfObjectAssignment2_1 obj[]) {
		System.out.println("USN\t     NAME\t \t\t   Marks:\t ");
		System.out.println("_____________________________________________________________");
		System.out.println("   \t     \t\t\t  HINDI\tENGLISH\t MATHEMATICS");
		for(int i =0;i<obj.length;i++) {
			System.out.print("|"+obj[i].USN+" "+String.format("|%-21s|", obj[i].name));
			System.out.println(" "+obj[i].hindi+"\t  "+obj[i].english+" \t    "+obj[i].mathematics+"     |");
		}
	}
	public static void main(String args[]) {
		ArrayOfObjectAssignment2_1  obj[] = new ArrayOfObjectAssignment2_1[5];
		obj[0] = new ArrayOfObjectAssignment2_1("20BTEK01", "Ravi Shankar Shukla");
		obj[1] = new ArrayOfObjectAssignment2_1("20BTEK02", "Mark Zukarbarg");
		obj[2] = new ArrayOfObjectAssignment2_1("20BTEK02", "Nitin Kumar");
		obj[3] = new ArrayOfObjectAssignment2_1("20BTEK02", "Ashutosh Kumar");
		obj[4] = new ArrayOfObjectAssignment2_1("20BTEK02", "Priyanka Sharma");
		obj[0].assignMarks(85,67,76);
		obj[1].assignMarks(82,77,83);
		obj[2].assignMarks(45,47,75);
		obj[3].assignMarks(65,57,39);
		obj[4].assignMarks(88,33,56);
		display(obj);
	}
}
