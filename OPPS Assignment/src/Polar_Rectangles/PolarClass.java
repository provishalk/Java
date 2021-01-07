package Polar_Rectangles;

class PolarClass
{
	double r,th;
	public PolarClass(){
	    //no need
	}
	public PolarClass(double a,double b)
	{
		r=a;
		th=b;
	}
	void toPolar(RectangularClass rec){
		r = Math.sqrt(rec.x)+Math.pow(rec.y, 2);
		th = Math.tan(rec.y/rec.x);
	}
	void show()
	{
		System.out.println("In polar form:r="+r +"and theta ="+th);
		
	}
}