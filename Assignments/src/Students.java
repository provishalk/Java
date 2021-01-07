
//Assignment 1
public class Students {
		String name,degree,semester;
		int rollNo;
		int[] marks = new int[5]; 
		public Students(String n,String d,String s,int r) {
			name = n;
			degree = d;
			semester = s;
			rollNo = r;
		}
		public Students() {
			System.out.print("Heelo");
		}
		
	
	public static void main(String[] args) {
		int noOfStudents = 5;
		Students[] student = new Students[noOfStudents] ;
		student[0] = new Students("Vishal","MCA","1st",1);
		student[1] = new Students("Ravi","MCA","1st",2);
		student[2] = new Students("Sachin","MCA","1st",3);
		student[3] = new Students("Rohit","MCA","1st",4);
		student[4] = new Students("Nitin","MCA","1st",5); 
		int a,b,x;
		a = 25 ; x = 10; b= a;
		System.out.print(a+" "+x);
		
	}

}