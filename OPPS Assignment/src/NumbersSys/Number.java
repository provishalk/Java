package NumbersSys;

public class Number {
	private double num;
	Number(){
		num = 1;
	}
	Number(double temp){
		num = temp;
	}
	void setter(double temp){
		num = temp;
	}
	double getter(){
		return num;
	}
	int typeOfNumber() {
		boolean N=false,Z=false;
		if(num>0 && (num%2==1 || num%2==0)) {
			N = true;
		}
		if(num%2==1 || num%2==0 || num%2==-1) {
			Z=true;
		}
		if(N && Z) {
			return 0;//0 if the number is real and an integer and a natural number
		}
		else if(!N && Z) {
			return 1;//1 if the number is real and integer but not a natural number
		}
		else {
			return 2;//2 if the number is real but neither an integer nor a natural number
		}
		
	}
	boolean isPrime(double n){
		if((num%2==1 || num%2==0 || num%2==-1) && num>0) {
			double i,m=0,flag=0;         
			  m=n/2;      
			  if(n==0||n==1){  
			   return false;      
			  }else{  
			   for(i=2;i<=m;i++){      
			    if(n%i==0){      
			     return false;             
			    }      
			   }      
			   if(flag==0)
				   return true;  
			  }//end of else  
		}
	return false;
	}    
	public static void main(String arhs[]) {
		Number n = new Number();
		n.setter(-23);
		System.out.println("Input:"+n.getter());
		System.out.println("Output:"+n.typeOfNumber());
		System.out.println("Is Prime:"+n.isPrime(n.getter()));
		//System.out.println(n.getter());
	}
}
