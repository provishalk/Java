import java.util.Scanner;

public class MatrixA {
	public void add(int n,int m,int first[][],int second[][]){
	    int  c, d;
	    int sum[][] = new int[m][n];
	    //n = No. of rows
	    //m = No. of columns
	    

	    for (c = 0; c < m; c++)
	      for (d = 0; d < n; d++)
	        sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices

	    System.out.println("Sum of the matrices:");

	    for (c = 0; c < m; c++)
	    {
	      for (d = 0; d < n; d++)
	        System.out.print(sum[c][d] + "\t");

	      System.out.println();
	    }
	  }
	public void transpose(int row,int column,int array[][]) {
		int i,j;
		System.out.println("Matrix before Transpose is ");
	  	for(i = 0; i < row; i++)
	    	{
	      	    for(j = 0; j < column; j++)
	            {
	          	System.out.print(array[i][j]+" ");
	            }
	            System.out.println(" ");
	        }
	 	System.out.println("Matrix after Transpose is ");
	  	for(i = 0; i < column; i++)
	    	{
	      	    for(j = 0; j < row; j++)
	            {
	                System.out.print(array[j][i]+" ");
	            }
	            System.out.println(" ");
	        }
	}
	public void sortRowWise(int m[][])
    {
        // loop for rows of matrix
        for (int i = 0; i < m.length; i++) {
 
            // loop for column of matrix
            for (int j = 0; j < m[i].length; j++) {
 
                // loop for comparison and swapping
                for (int k = 0; k < m[i].length - j - 1; k++) {
                    if (m[i][k] > m[i][k + 1]) {
 
                        // swapping of elements
                        int t = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = t;
                    }
                }
            }
        }
 
        // printing the sorted matrix
        System.out.println("Sorted Matrix is:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }

    }
	public static void main(String args[]) {
		MatrixA obj = new MatrixA();
		//Addition of two Matrix
		int m,n,c,d;
		Scanner in = new Scanner(System.in);

	    System.out.print("Enter the number of rows and columns of matrix:");
	    m = in.nextInt();
	    n = in.nextInt();
 
	    int first[][] = new int[m][n];
	    int second[][] = new int[m][n];
	    

	    System.out.print("Enter the elements of first matrix:");

	    for (c = 0; c < m; c++)
	      for (d = 0; d < n; d++)
	        first[c][d] = in.nextInt();

	    System.out.print("Enter the elements of second matrix:");

	    for (c = 0 ; c < m; c++)
	      for (d = 0 ; d < n; d++)
	        second[c][d] = in.nextInt();
	    obj.add(n, m, first, second);
	    //Transpose of matrix
	    obj.transpose(n, m, first);
	    //Sort each row of the matrix in increasing order of values
	    obj.sortRowWise(second);
	}
}
