import java.util.Scanner;

class Invoice{
	String partNumber;
	String partDescription;
	int itemPurchased;
	double pricePerItem;
	Invoice(){
		partNumber = "";
		partDescription = "";
		itemPurchased = 0;
		pricePerItem = 0.0;
		}
	String getPartNumber(){
		return partNumber;
		}
	String getPartDescription(){
		return partDescription;
		}
	int getItemPurchased(){
		return itemPurchased;
		}
	double getPricePerItem(){
		return pricePerItem;
		}
	double getInvoiceAmount(){
		return (itemPurchased * pricePerItem);
		}
	void setPartNumber(String pn){
		partNumber = pn;
		}
	void setPartDescription(String desc){
		partDescription = desc;
		}
	void setQuentity(int quentity){
			if (quentity<0) {
				itemPurchased = 0;
			}else{
				itemPurchased = quentity;
			}
		}
	void setPricePerItem(double price){
		if (price<0) {
			pricePerItem = 0.0;
		}else{
			pricePerItem = price;
		}
		}
	
	}
