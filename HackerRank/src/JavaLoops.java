import java.math.*; 
public class JavaLoops {

	public static void main(String[] args) {
		double a,b,n,temp;
		a=0;
		b=2;
		n=10;
		for(int i=0;i<5;i++) {
			temp = a + Math.pow(2, i)*b;;
			System.out.println((int) (a+temp));
		}

	}

}
