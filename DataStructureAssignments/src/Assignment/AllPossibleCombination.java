package Assignment;
import java.util.*;


public class AllPossibleCombination {
	public static boolean balanced(String str) {
		if(str.length()%2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)) {
			case '(' : 
					   stack.push('(');
					   break;
			case ')' :  
						if(stack.size()==0) return false;
						if(stack.pop()=='(') break;
			}
		}
		if(stack.size()>0) return false;
		return true;
	}
	public static void main(String args[]) {
		String two = "()";
		String temp,result;
		result = "";
		int input = 4*2;
		for(int i=1;i<=Math.pow(2, input);i++) {
			//Change 6 to the value of input
			temp = String.format("%8s", Integer.toBinaryString(i)).replaceAll(" ", "0");
			for(int j=0;j<input;j++) {
				result += two.charAt(Integer.parseInt(Character.toString(temp.charAt(j))));
			}
			if(balanced(result)) {
				System.out.println(result);
			}
			result = "";
		}
	}
}
