import java.util.* ;
public class MinimumElement{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in) ;
		Stack <Integer> stack = new Stack <> () ;
		Stack <Integer> stack1 = new Stack <> () ;
		Stack <Integer> stack2 = new Stack <> () ;
		System.out.println("Enter the number of elements") ;
		//int n = input.nextInt() ;
		int i,j,temp ;
		while(true){
		j=input.nextInt() ;
		if(j==1){
			temp=input.nextInt() ;
			if(!stack.isEmpty() && stack.peek()<temp){
				while(!stack.isEmpty() && temp>stack.peek()){
					stack1.push(stack.pop()) ;
				}
				stack.push(temp) ;
				while(!stack1.isEmpty()){
					stack.push(stack1.pop()) ;
				}
			}
			else stack.push(temp) ;
			stack2.push(temp) ;
		}
		if(j==2){
			int k=stack2.pop() ;
			while(stack.peek()!=k){
				stack1.push(stack.pop()) ;
			}
			stack.pop() ;
			while(!stack1.isEmpty())
				stack.push(stack1.pop());
			System.out.println(k) ;
		}
		if(j==3){
			System.out.println(stack.peek()) ;
		}
		if(j==4)
			return ;

		}
	}
}
