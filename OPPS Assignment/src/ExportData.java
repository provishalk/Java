
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ExportData {
	public static void main(String args[]) {
		//FileOutputStream f1;
//		FileInputStream f2;
		//FileWriter strwrite;
//		char output[] = {'T','h','i','s',' ','i','s',' ','V','i','s','h','a','l'};
		
		//int b;
		String s ="";
		try {
			FileWriter fw=new FileWriter("E:\\CodingZone\\Java\\OPPS Assignment\\src\\Export.txt");   
	        for(int i=0;i<5;i++) {
	        	for(int j = 0;j<i+1;j++) {
//	        		System.out.print("* ");
	        		s += "* ";
	        	}
	        	s+="\n";
	        }
	        fw.write(s);
	        fw.close();
//			f2 = new FileInputStream("E:\\\\CodingZone\\\\Java\\\\OPPS Assignment\\\\src\\\\Import.txt");
//			f1 = new FileOutputStream("E:\\\\CodingZone\\\\Java\\\\OPPS Assignment\\\\src\\\\Export.txt");
//			
//			while((b=f2.read())!= -1 ) {
//				f1.write(b);
//			}
		}
		catch(IOException e){
			System.out.println(e);
			
		}
		System.out.println("Successful...");
	}

}
