import java.util.Scanner;

public class BankAccount {
	private int accountNo;
	private String typeOfAccount;
	private double balance;
	BankAccount(int accountNo,String typeOfAccount, double balance){
		this.accountNo = accountNo;
		this.balance = balance;
		this.typeOfAccount = typeOfAccount;
	}
	
	void deposit(double amount) {
		this.balance += amount;
		System.out.println("Your Balance :"+this.balance);
		System.out.println("Location : Ghazipur");
		System.out.println("Date : "+java.time.LocalDate.now());  
	}
	
	void withdraw(double amount) {
		if(amount>this.balance) {
			System.out.println("Balance : "+this.balance);
			System.out.println("You dont have enough balance to withdrow.");
			return;
		}
		this.balance -= amount;
		System.out.println("Your Balance :"+this.balance);
		System.out.println("Location : Ghazipur");
		System.out.println("Date : "+java.time.LocalDate.now()); 		
	}
	
	void accountDetails() {
		System.out.println("Your Acoount No : "+this.accountNo);
		System.out.println("Your Current balance : "+this.balance);
		System.out.println("Type Of Account : "+this.typeOfAccount);
		
	}

	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of Customers : ");
		int numberOfEmployee = scan.nextInt();
		int accountNo;
		String typeOfAccount;
		double balance;
		BankAccount customer[] = new BankAccount[numberOfEmployee];
		for(int i = 0 ;i < numberOfEmployee;i++) {
			System.out.println("Enter Details Of Customer : "+(i+1));
			System.out.println("Account No :"+i);
			System.out.print("Type Of Account :");
			typeOfAccount = scan.next();
			System.out.print("Initial Balance :");
			balance = scan.nextDouble();
			customer[i] = new BankAccount(i, typeOfAccount, balance);
		}
		int temp = 1;
		while(temp != 0) {
			System.out.println("Select From Given Opetion:");
			System.out.println("1) To Check Balance");
			System.out.println("2) To Deposite Money");
			System.out.println("3) To Withdraw Money");
			System.out.println("0) To Exit");
			temp = scan.nextInt();
			if(temp == 0)
				break;
			switch(temp) {
			case 1 :
				System.out.print("Enter Account Number");
				accountNo = scan.nextInt();
				customer[accountNo].accountDetails();
				break;
			case 2 :
				System.out.print("Enter Account Number");
				accountNo = scan.nextInt();
				System.out.print("Amount :");
				customer[accountNo].deposit(scan.nextDouble());
				break;
			case 3 :
				System.out.print("Enter Account Number");
				accountNo = scan.nextInt();
				System.out.print("Amount :");
				customer[accountNo].withdraw(scan.nextDouble());;
				break;
			default:
				System.out.println("Invalid Input Try Again");
				break;
				
			}
		}
		//System.out.println(accountNo+" "+typeOfAccount+" "+balance);
		scan.close();
	}
}