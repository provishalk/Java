/*Q1. Write a Java program that calculates simple interest. Take any constant values for principle, rate and time.
Formula: = P × T × R ⁄ 100
A	=	final amount
P	=	initial principal balance
r	=	annual interest rate
t	=	time (in years)*/
public class SimpleIntrest {
	float calculateSI(float p, float r, float t) {
		return (p*r*t)/100;
	}
	public static void main(String[] args) {
		SimpleIntrest obj = new SimpleIntrest();
		float p = 2000; //Principal Value
		float r = 10;   //Annual Interest Rate
		float t = 1;	//Time (In Years)
		System.out.println("Principal amount is Rs. 2000");
		System.out.println("Time period is 1 year");
		System.out.println("Rate is 10%");
		float A = obj.calculateSI(p, t, r);
		System.out.println("Simple Interest is : "+A);
		System.out.println("Final Amount is : "+(A+p));
		

	}

}
