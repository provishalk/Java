import java.util.Scanner;

public class InvoiceTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Invoice invoice = new Invoice();
		System.out.print("Enter part number :");
		invoice.setPartNumber(sc.nextLine());
		System.out.print("Enter part description :");
		invoice.setPartDescription(sc.nextLine());
		System.out.print("Enter Quantity of item purchased :");
		invoice.setQuentity(sc.nextInt());
		System.out.print("Enter price per item :");
		invoice.setPricePerItem(sc.nextDouble());
		System.out.println("Detail of items purchasing–>");
		System.out.println("Part number :" + invoice.getPartNumber());
		System.out.println("Part description :" + invoice.getPartDescription());
		System.out.println("Total Billing Amount :" + invoice.getInvoiceAmount());
		sc.close();
		}

}
