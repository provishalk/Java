
public class reverseINT {

	public static void main(String[] args) {
		int x=9646324351;
		boolean tf = false;
		 if(x<0) {
			 x = x*-1;
			 tf = true;
		 }
		 StringBuilder sb = new StringBuilder(x+"");
	            
	        if(tf) {
	        	System.out.println((Integer.parseInt(sb.reverse().toString()))*-1);
	        }
	        System.out.println(Integer.parseInt(sb.reverse().toString()));
	}

}
