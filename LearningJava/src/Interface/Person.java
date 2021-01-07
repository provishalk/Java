package Interface;

public class Person implements YouTuber,Student {
	public static void main(String args[]) {
		Person obj = new Person();
		obj.channal();
		obj.study();
		
	}
	public void study() {
		System.out.println("This person has completed his study in IIT ");
	}

	
	public void channal() {
		System.out.println("This person yooutube channal name is FlyingBeast");
		
	}

}
