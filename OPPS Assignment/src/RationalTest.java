import java.util.Scanner;

public class RationalTest {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rational a;
        Rational b;

        System.out.print("Enter numerator for the first rational number: ");
        int numa = input.nextInt();
        System.out.print("Enter a non-zero denominator for the first rational number: ");
        int denoma = input.nextInt();
        System.out.print("Enter a numerator for the second rational number: ");
        int numb = input.nextInt();
        System.out.print("Enter a non-zero denominator for the second rational number: ");
        int denomb = input.nextInt();
        a = new Rational(numa, denoma);
        b = new Rational(numb, denomb);
        System.out.println("First rational number is: " + a);
        System.out.println("Second rational number is: " + b);
        System.out.println("Addition : " + a.add(b));
        System.out.println("Subtraction of the rational number is: " + a.subtract(b));
        System.out.println("Multiplication of the rational number is: " + a.multiply(b));
        System.out.println("Division of the rational number is: " + a.divide(b));
        input.close();
    }

}
