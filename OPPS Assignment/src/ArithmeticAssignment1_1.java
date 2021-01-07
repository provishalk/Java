
public class ArithmeticAssignment1_1 {
	static int multiply(int x, int y) {
		return x*y;
	}
	static float multiply(float x, float y) {
		return x*y;
	}
	static int[][] multiply(int a[][] , int b[][]) {
		//multiplying and printing multiplication of 2 matrices 
		int c[][]=new int[3][3]; 
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				c[i][j]=0;      
				for(int k=0;k<3;k++){      
					c[i][j]+=a[i][k]*b[k][j];      
				}//end of k loop  
				System.out.print(c[i][j]+" ");  //printing matrix element  
			}//end of j loop  
			System.out.println();//new line
		}
		return c;
	}
	public static void main(String args[]) {
		
		//Multiplication of Integer Values
		System.out.println("45 x 76 = "+multiply(45, 76));
		//Multiplication of Float Values
		System.out.println("15.7 x 37.9 = "+multiply(15.7f, 37.9f));
		//Multiplication of two Matrix
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
		multiply(a,b);
	}
}

