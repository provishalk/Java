import java.util.Scanner;
public class Login {
	boolean validUser(int id) {
		int userId[] = {1,2,3,4,5};
		int size = userId.length;
		for (int i=0;i<size;i++) {
			if(userId[i] == id) {
				if(validPass(i)) {
					System.out.println("Succesfully logged IN.");
					return true;
				}
				else {
					System.out.println("Invalid Password");
					return false;
				}
			}
		}
		System.out.print("Invalid UserName");
		return false;
	}
	boolean validPass(int pos) {
		Scanner sc = new Scanner(System.in);
		String pass[] = {"abc","xyz","yyz","bca","mca"};
		System.out.print("Enter Password:");
		String d = sc.nextLine();
		if(d.equals(pass[pos])) {
			sc.close();
			return true;
		}
		sc.close();
		return false;
	}
	public static void main(String[] args) {
		Login u1 = new Login();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter User Name:");
		int user = sc.nextInt();
		u1.validUser(user);
		sc.close();
	}

}
