
public class Complex {
	double realPart;
	double imaginaryPart;
	Complex(){
		realPart =0;
		imaginaryPart =0;
	}
	Complex(double real,double imaginary){
		realPart = real;
		imaginaryPart = imaginary;
	}
	public Complex add (Complex otherNumber) {
		Complex temp = new Complex();
		temp.imaginaryPart = imaginaryPart + otherNumber.imaginaryPart;
		temp.realPart = realPart + otherNumber.realPart;
		return temp;
	}
	public Complex subtract (Complex otherNum) {
		Complex temp = new Complex(); 
		temp.realPart = realPart - otherNum.realPart; 
        temp.imaginaryPart = imaginaryPart - otherNum.imaginaryPart;
        return temp; 
	}
	public Complex multiply (Complex otherNum) {
		Complex temp = new Complex();
        temp.realPart = (realPart * otherNum.realPart) - (imaginaryPart * otherNum.imaginaryPart);
        temp.imaginaryPart = (realPart * otherNum.imaginaryPart) + (imaginaryPart * otherNum.realPart); 
		return temp;
	}
	public void setRealPart (double real) {
		realPart = real;
	}
	public void setImaginaryPart (double imag) {
		imaginaryPart = imag;
	}
	public double getRealPart() {
		return realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}

	public static void main(String[] args) {
		Complex a = new Complex();
		Complex b = new Complex(1.2,1.7);
		Complex c = new Complex();
		Complex result = new Complex();
		a.setRealPart(1.8);
		a.setImaginaryPart(1.5);
		result = a.add(b);
		System.out.println("After adding:("+result.getRealPart()+" + "+result.getImaginaryPart()+"i)");
		result =a.multiply(b);
		System.out.println("After multiply:("+result.getRealPart()+" + "+result.getImaginaryPart()+"i)");
		result = a.subtract(b);
		System.out.println("After subtract:("+result.getRealPart()+" + "+result.getImaginaryPart()+"i)");
		

	}

}
