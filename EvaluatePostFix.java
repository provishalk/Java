
class EvaluatePostFix{
	Stack stk = new Stack();
	int firstNo,secondNo,length;
	
	int result(String equation){
		length =  equation.length();
	    for(int i=0;i<length;i++){
			if(Character.isDigit(equation.charAt(i))){
				int num = Integer.parseInt(String.valueOf(equation.charAt(i)));
				stk.push(num);
			}
			else 
			{
				secondNo = stk.pop();
				firstNo = stk.pop();
				switch(equation.charAt(i)){
					case '+' :  stk.push(firstNo+secondNo);
								break;
					case '*' :  stk.push(firstNo*secondNo);
								break;
					case '/' :  stk.push(firstNo/secondNo);
								break;
					case '-' :  stk.push(firstNo-secondNo);
								break;
					
				}
			}
		}
		
		//if(Character.isDigit(equation.charAt(0))
		//char j = equation.charAt();
		//System.out.print(lenth);
		return stk.pop();
	}
	public static void main(String arg[]){
		EvaluatePostFix obj = new EvaluatePostFix();
		String equ = "524*+6+";
		System.out.println("Postfix Equation is : "+equ);
		System.out.println("Result of Postfix Equation is : "+obj.result(equ));
	}
}