import java.util.* ;
import static java.lang.System.out ;
public class ExpressionBalancing{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in) ;
		Stack <Character> stack = new Stack <> ();
		out.println("Enetr the input string") ;
		String str = input.next() ;
		int i ;
		//out.println(str) ;
		for(i=0;i<str.length();i++){
			char ch=str.charAt(i) ;
			switch(ch){
				case '(':stack.push(ch) ;break ;
				case '{':stack.push(ch) ;break ;
				case '[':stack.push(ch) ;break ;
				case ')':if(!stack.isEmpty() && stack.pop()=='(') break ; else {out.println("Unbalanced");return ;}
				case '}':if(!stack.isEmpty() && stack.pop()=='{') break ; else {out.println("Unbalanced");return ;}
				case ']':if(!stack.isEmpty() && stack.pop()=='[') break ; else {out.println("Unbalanced");return ;}
			}
		}
		if(stack.isEmpty())
			out.println("Balanced") ;
		else
		       	out.println("Unbalanced") ;
		return  ;
	}

}
