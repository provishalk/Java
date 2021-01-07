/*Q4. Write a Java program calculates the 10th term and sum of the first 5 terms in an arithmetic progression. 
 * Take constant first term and common difference for the progression.
 * The nth term of AP	A'n = a + (n – 1) × d
 * Sum of n terms in AP	n/2[2a + (n – 1)d]
*/
public class Progression {
	void arithmetic_progression(float first_term,float common_diffrence) {
		float value_at_10th = first_term + (9*common_diffrence);
		float sum_of_5_terms = (5.0f/2)*((2*first_term) + (4*common_diffrence));
		System.out.println("Value Of 10th term is:"+value_at_10th);
		System.out.println("Sum of the first 5 terms is:"+sum_of_5_terms);
	}

	public static void main(String[] args) {
		Progression obj = new Progression();
		obj.arithmetic_progression(2,5);
		 int vishal = 10;
		 System.out.print(vishal);

	}

}
