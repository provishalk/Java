import java.util.*;
class MyException extends Exception 
{ 
    //store account information 
    private static int accno[] = new int[30]; 
  
    private static String name[] = new String[30]; 
  
    private static double bal[] = new double[30];
  
    // default constructor 
    MyException() {    } 
  
    // parametrized constructor 
    MyException(String str) { super(str); } 
  
    // write main() 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Number of Users:");
    	int n = sc.nextInt();
	    	for(int i =0; i<n; i++) {
	    		System.out.println("For User:"+(i+1));
	    		System.out.print("Enter Account No:");
	    		accno[i] = sc.nextInt();
	    		System.out.print("Enter Name:");
	    		sc.nextLine();
	    		name[i] = sc.nextLine();
	    		System.out.print("Enter Balance:");
	    		bal[i] = sc.nextInt();
	    	}
    	try {
    		// display the heading for the table 
            System.out.println("ACCNO" + "\t" + "CUSTOMER" + 
                                              "\t" + "BALANCE"); 
            // display the actual account information 
            for (int i = 0; i < n ; i++) 
             { 
                 System.out.println(accno[i] + "\t" + name[i] + 
                                                  "\t\t" + bal[i]);
                 if (bal[i] < 1000) 
                 { 
                     MyException me = 
                        new MyException("Balance is less than 1000"); 
                     throw me; 
                 } 
      
             } 
            
    	}
    	catch(MyException e) {
    		e.printStackTrace();
    	}
    } 
}