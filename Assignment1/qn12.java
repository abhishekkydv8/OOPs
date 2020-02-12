import java.util.* ;
class qn12{
	public static void main(String [] args){
		Stack <Integer> stack =new Stack <Integer> () ;
		Stack <Integer> stack1=new Stack <Integer> () ;
		Scanner input= new Scanner(System.in) ;
		int i ;
		int n=input.nextInt() ;
		for(i=0;i<n;i++){
			stack.push(input.nextInt()) ;
		}
		
		while(!stack.empty()){
			int temp=stack.pop() ;
			int temp1=stack1.pop() ;
			stack1.push(temp1) ;
			if(temp<= temp1 || stack1.empty()){
				stack1.push(temp) ;
			}
			else{
				while(temp>temp1){
					stack.push(stack1.pop()) ;
				}
				stack1.push(temp) ;
			}
		}		

		for(i=0;i<n;i++){
                        System.out.println(stack1.pop()) ;
                }

	}


}
