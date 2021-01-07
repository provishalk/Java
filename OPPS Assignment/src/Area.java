/* Q2. Write a Java program that calculates the area of a circle. Take a constant value for the radius of the circle
 * Formula Area = πr^2 ( π =3.14 )
	
*/
public class Area {
	double area_of_circle(float r) {
		return 3.14*(r*r);
	}
	public static void main(String[] args) {
		float radius = 5;
		Area obj = new Area();
		double area = obj.area_of_circle(radius);
		System.out.println("Area of Circle is :"+area);

	}

}
