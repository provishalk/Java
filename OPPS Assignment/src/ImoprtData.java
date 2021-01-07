import java.io.FileInputStream;
import java.io.IOException;

public class ImoprtData {
	public static void main(String args[]) {
		FileInputStream file;
		int b;
		try {
			file = new FileInputStream("E:\\CodingZone\\Java\\OPPS Assignment\\src\\Import.txt");
			while((b = file.read())!=-1) {
				System.out.print((char) b);
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
}
