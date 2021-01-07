package AcessSpecifier;

public class Student {
	public String name;
	int rollNo; 
	private String mobNo;
	protected String address;
	public void pub() {
		System.out.println("I am  public function from student Class.");
	}
	protected void pro() {
		System.out.println("I am protected function from student Class.");
	}
	private void pri() {
		System.out.println("I am  private function from student Class.");
	}
	void def() {
		System.out.println("I am  Default function from student Class.");
	}
	public Student(){
		
	}
	Student(String n,int roll,String m,String adrs){
		name = n;
		rollNo = roll;
		mobNo = m;
		address = adrs;
	}
	void allDetail() {
		//Printing all the details Within a class
		System.out.println("-----------------------");
		System.out.println("Full Detail Of Student:");
		System.out.println("-----------------------");
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollNo);
		System.out.println("Mobile No: "+mobNo);
		System.out.println("Address: "+address);
		System.out.println("-------------------------------");
		System.out.println("Accessing Methods Within Class:");
		System.out.println("-------------------------------");
		pub();
		pri();
		pro();
		def();
	}

}
