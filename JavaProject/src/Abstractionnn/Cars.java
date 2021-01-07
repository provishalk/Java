package Abstractionnn;

class Cars extends WagonR {
	public void model() {
		System.out.println("Model is: ZXI");
	}
	public void color() {
		System.out.println("Colour of Car is White");
		
	}

	public static void main(String[] args) {
		Cars c = new Cars();
		c.color();
		c.model();

	}

}
