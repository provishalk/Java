package Polar_Rectangles;


public class RectangularClass{
	double x,y;
    public RectangularClass(){
	    //no need
	}
    RectangularClass(double x,double y){
    	this.x = x;
    	this.y = y;
    }
	void toRectangularClass(PolarClass p)
	{
		x=(p.r*Math.cos(p.th));
		y=(p.r*Math.sin(p.th));
	}
	void show()
	{
		System.out.println("In Rectangular form :x="+x+"and y="+y);
	}
	public static void main(String args[])
	{
	PolarClass p =  new PolarClass(15.5,13.14/2);
	p.show();
	RectangularClass r = new RectangularClass();
	//polar to rectangular form
	r.toRectangularClass(p);
	//r=p;
	r.show();
	p.toPolar(r);
	p.show();
	}
}
