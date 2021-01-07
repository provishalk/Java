import java.util.Scanner;

public class Employee {
	private int employeeNo;
	private double basic;
	private double da;
	private double incomeTax;
	private double grossSal;
	private double netSal;
	void recalculate(double basic) {
		this.basic = basic;
		this.da = (this.basic*52.00)/100.00;
		this.incomeTax = (this.basic*30.00)/100.00;
		this.grossSal = this.da+this.basic;
		this.netSal = this.grossSal-this.incomeTax;
	}
	Employee(int employeeNo,double basic){
		this.employeeNo = employeeNo;
		this.basic = basic;
		recalculate(basic);
	}
	void empDetails() {
		//Print for each employee details of employee_no, basic, net_sal and gross salary.
		System.out.print("   "+this.employeeNo+"\t\t");
		System.out.print(String.format("%.2f", this.basic)+"\t   ");
		System.out.print(String.format("%.2f", this.netSal)+"\t   ");
		System.out.print(String.format("%.2f", this.grossSal)+"\t\n");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No Of Employee :");
		int noOfEmp = sc.nextInt();
		int empNo;
		double basic;
		Employee emp[] = new Employee[noOfEmp];
		for(int i =0 ;i<noOfEmp;i++) {
			System.out.println("Enter Detail of Employee : "+(i+1));
			System.out.println("Employee Id  : "+i);
			System.out.print("Enter Basic Pay : ");
			basic = sc.nextDouble();
			emp[i] = new Employee(i,basic);
		}
		int temp = 1;
		while(temp != 0) {
			System.out.println("Select From Given Options:");
			System.out.println("1) To Check Employee Detail");
			System.out.println("2) To Check Details of All Employee");
			System.out.println("3) To Update Basic Pay Of Employee");
			System.out.println("0) To Exit");
			temp = sc.nextInt();
			if(temp == 0)
				break;
			switch(temp) {
			case 1 :
				System.out.print("Enter Emp No: ");
				empNo = sc.nextInt();
				System.out.println("Employee No  |  Basic  |  Net Salary  |  Gross Salary");
				emp[empNo].empDetails();
				break;
			case 2 :
				System.out.println("Employee No  |  Basic  |  Net Salary  |  Gross Salary");
				for(int i =0 ;i<noOfEmp;i++) {
					emp[i].empDetails();
				}
				break;
			case 3 :
				System.out.print("Enter Employee Id:");
				empNo = sc.nextInt();
				System.out.print("Enter new Basic Pay Amount :");
				basic = sc.nextDouble();
				emp[empNo].recalculate(basic);
				System.out.println("Basic Pay Updated Succesfully :");
			}
		}
		sc.close();
	}
}
