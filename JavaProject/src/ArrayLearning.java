public class ArrayLearning {
	
	public static void main(String args[]) {
		int list[][] = new int[2][];
		list[0] = new int[3];
		list[1] = new int[4];
		list[0][0] = 21;
		list[0][1] = 22;
		list[0][2] = 23;
		list[1][0] = 24;
		list[1][1] = 25;
		list[1][2] = 26;
		list[1][3] = 27;	
		for(int i=0;i<list.length;i++) {
			for(int j=0;j<list[i].length;j++) {
				System.out.print(list[i][j]+" ");	
			}
			System.out.println();
		}
	}
}
