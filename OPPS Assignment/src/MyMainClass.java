import java.util.*;

interface Animal {
  public void animalSound(); 
  public void sleep(); 
}


class Pig implements Animal {
  public void animalSound() {
    
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    System.out.println("Zzz");
  }
}
class PigBaby extends Pig{
	public void animalSound() {
	    System.out.println("The BabyPig says: wee wee");
	  }
	
}
public class MyMainClass {

	public static void main(String[] args) {
		Pig myPig = new Pig(); 
		Scanner sc = new Scanner(System.in);
		int x=0;
		PigBaby baby = new PigBaby();
		Pig r;
		r= baby;
		do {
			System.out.println("Enter Value To perform action:");
			System.out.println("1 Know how pig sound");
			System.out.println("2 Pig is Sleeping");
			System.out.println("3 To know Babypig Sound");
			x = sc.nextInt();
			switch(x) {
			case 1 : myPig.animalSound();
					break;
			case 2 : myPig.sleep();
					break;
			case 3 : r.animalSound();
					break;
			default: System.out.print("Enter Correct Value");
					x = 0;
					break;
			}
		}while(x == 0);
		sc.close();

	}

}