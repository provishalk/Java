package AcessSpecifier;
public class ControllerClass extends Student{

	public static void main(String[] args) {
		//Accessing data member within a package 
		Student s1 = new Student("Vishal Kumar",25,"9999654754","Ghazipur");
		System.out.println("Name: "+s1.name);
		System.out.println("Roll No:"+s1.rollNo);
		System.out.println("Address: "+s1.address);
		//System.out.println(s1.mobNo); As mobile no is private so we can'not use directly outside the class.
		s1.allDetail();
		ControllerClass d1 = new ControllerClass();
		System.out.println("---------------------------------------------------");
		System.out.println("Accessing Methods Within Package But Outside Class:");
		System.out.println("---------------------------------------------------");
		d1.pub();
		d1.pro();
//		d1.pri(); The method pri() from the type Student is not visible
		d1.def();
		
	}
}
