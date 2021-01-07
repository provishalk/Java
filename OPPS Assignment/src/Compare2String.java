import java.util.Scanner;

public class Compare2String {
	boolean compare(String one,String two) {
		if(one.equals(two)) {
			return true;
		}
		else {
			return false;
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Compare2String ob = new Compare2String();
		System.out.print("Enter First String:");
		String first = sc.nextLine();
		System.out.print("Enter Second String:");
		String second = sc.nextLine();
		System.out.print("Is both string is same?"+ob.compare(first, second));;
		sc.close();
	}

}