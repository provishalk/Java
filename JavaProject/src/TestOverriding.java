/*Question: - Design a Java program to achieve runtime polymorphism 
 * using method overriding concept, with sample I/Os and 
 * justify your answer (10 marks).*/
import java.util.*;

class Father{
	
	public void home(){
		System.out.println("Father's home");
	}
	
	//Overridden method
	public void car(String brand){	
		System.out.println("Father's Car :"+brand);
	}	
}
class Son extends Father{
	
	//Overriding method
	public void car(String brand) {
		System.out.println("Son's Car : "+brand);		
	}
	public void bike() {
		System.out.println("Son's Bike: Ducati ");
	}
}
public class TestOverriding {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Father f = new Father(); //Object of Father class
		Son s = new Son();	//Object of son Class
		Father ref;
		ref = f;
		System.out.print("Enter Father's car brand:");
		String brand = obj.nextLine();
		ref.car(brand);
		ref = s;
		System.out.print("Enter Son's car brand:");
		brand = obj.nextLine();
		ref.car(brand);
		s.bike();
	}
}
