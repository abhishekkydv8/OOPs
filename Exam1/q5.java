package exam1;
import java.util.* ;
public class Addition extends LinkedList{
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in) ;
		LinkedList ll= new LinkedList() ;
		LinkedList ll1= new LinkedList() ;
		LinkedList ll2= new LinkedList() ;
		Stack stack = new Stack () ;
		Stack stack2 = new Stack () ;
		Stack stack1 = new Stack () ;
		int quotient=0 ;
		int remainder,count=0,count1=0 ;
		int temp,t1=0,t2=0,count2=0 ;
		int num1=input.nextInt() ;
		int num2=input.nextInt();
		quotient=num1/10 ;
		while(quotient>0) {
			quotient=num1/10 ;
			remainder = num1%10 ;
			stack.push(remainder) ;
			count++ ;
			ll.add(remainder) ;
			num1=num1/10 ;
		}
		
		quotient=num2/10 ;
		while(quotient>0) {
			quotient=num2/10 ;
			remainder = num2%10 ;
			stack1.push(remainder) ;
			count1++ ;
			ll1.add(remainder) ;
			num2=num2/10 ;
		}
		for(int k=0;k<count;k++) {
			temp=stack.pop() ;
			t1=t1*10+temp ;
		}
			
		for(int k=0;k<count1;k++) {
			temp=stack1.pop() ;
			t2=t2*10+temp ;
		}
		temp=t1+t2 ;

		quotient=temp ;
		while(quotient>0) {
			quotient=temp/10 ;
			remainder = temp%10 ;
			stack2.push(remainder) ;
			count2++ ;
			ll2.add(remainder) ;
			temp=temp/10 ;
		}
		for(int k=0;k<count2;k++)
			System.out.print(stack2.pop()) ;
	}
}