package Sports;
import AcessSpecifier.*;

public class FootballTeam{
	public static void main(String args[]) {
		System.out.println("Hello This is Football team:");
		Student fteam = new Student();
		CricketTeam cteam = new CricketTeam();
		System.out.println("-----------------------------------");
		System.out.println("Accessing Methods Outside Package :");
		System.out.println("-----------------------------------");
		fteam.pub();
//		fteam.pro(); //The method pro() from the type Student is not visible
//		fteam.pri(); The method pri() from the type Student is not visible
//		fteam.def(); The method def() from the type Student is not visible
		System.out.println("----------------------------------------------");
		System.out.println("Accessing Methods Outside package by subclass:");
		System.out.println("----------------------------------------------");
		cteam.myfunction();
//		cteam.pro(); The method pro() from the type Student is not visible
	}
	
}
