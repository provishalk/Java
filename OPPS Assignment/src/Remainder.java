/*Q3. Write a Java program that calculates the remainder of a number when it is divided by 3. Take number to be checked as any constant.*/

public class Remainder {
	int remainder(int divident, int divisor) {
		int remainder;
		remainder = divident % divisor;
		return remainder;
	}
	public static void main(String[] args) {
		Remainder obj = new Remainder();
		int divident , divisor;
		divident = 1535;
		divisor = 3;
		System.out.println(obj.remainder(divident, divisor));

	}

}
