
/***Write a Java program that writes the second word (and its length) in a multi-word String. 
Words are separated by spaces, punctuation and tabs.Test your code on the sentence 
“Actually, couldn’t you come with me?” The correct answer should be couldn’t(8).***/
public class Assignment1_2 {
	static void analyseString(String str) {
		int flag = 0;
		int temp=0;
		String s = "";
		for(int i =0;i<str.length();i++) {
			if((str.charAt(i)==' '||str.charAt(i)==','||str.charAt(i)=='-'||str.charAt(i)=='.'||str.charAt(i)==';'||str.charAt(i)=='_'||str.charAt(i)==':')&& flag == 0) {
				i++;
				while(str.charAt(i)==' '||str.charAt(i)==','||str.charAt(i)=='-'||str.charAt(i)=='.'||str.charAt(i)==';'||str.charAt(i)=='_'||str.charAt(i)==':') {
					i++;
				}				
				while(str.charAt(i)!=' ') {
					s += str.charAt(i);
					temp++;
					i++;
				}
				break;
			}
			
		}
		System.out.println(s+"("+temp+")");
	}
	public static void main(String args[]) {
		String str = "Actually,-;:   couldn’t you come with me?";
		analyseString(str);
	}

}
