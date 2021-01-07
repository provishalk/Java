class Employees{
	String Name;
	int ssn;
	String BirthDate;
	String Address;
	String JobType;
	
}
class Secretary extends Employees{
	int TypingSpeed;
}
class Technician extends Employees{
	String TGrade;
}
class Engineer extends Employees{
	String EngType;
}
public class start{
	public static void main(String args[])
	{
		Secretary obj1 = new Secretary();
 		obj1.Name= "Vishal";
		System.out.println(obj1.Name);
		
	}
}