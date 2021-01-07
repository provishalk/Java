
import java.util.Stack; 
  
class InfixToPostFix
{ 
     
    static String infixToPostfix(String equ) 
    { 
        String result = new String(""); 
        
		Stack<Character> stk = new Stack<Character>(); 
          
        for (int i = 0; i<equ.length(); ++i) 
        { 
            char ch = equ.charAt(i); 
              
			if (Character.isLetterOrDigit(ch))
                result = result + ch; 
               
            else if (ch == '(') 
                stk.push(ch); 
              
            else if (ch == ')') 
            { 
                while (!stk.isEmpty() && stk.peek() != '(') 
                    result += stk.pop(); 
                  
                if (!stk.isEmpty() && stk.peek() != '(') 
                    return "Invalid Expression";                 
                else
                    stk.pop(); 
            } 
            else 
            { 
                while (!stk.isEmpty() && Prec(ch) <= Prec(stk.peek())){ 
                    if(stk.peek() == '(') 
                        return "Invalid Expression"; 
                    result += stk.pop(); 
             } 
                stk.push(ch); 
            } 
       
        } 
       
        while (!stk.isEmpty()){ 
            if(stk.peek() == '(') 
                return "Invalid Expression"; 
            result += stk.pop(); 
         } 
        return result; 
    } 
	static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 
      
    
    public static void main(String[] args)  
    { 
        String equ = "5+2*(7^9-4)^(8+4*3)-2"; 
        System.out.println(infixToPostfix(equ)); 
    } 
} 