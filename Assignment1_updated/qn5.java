import static java.lang.System.out  ;
import java.util.* ;
public class ReversingArray{
	public static void main (String [] args){
		Queue <Integer> queue = new LinkedList <> () ;
		Queue <Integer> ans = new LinkedList <> () ;
		Scanner input = new Scanner (System.in) ;
		out.println("Enter the number of input") ;
		int i,j ;
		int n = input.nextInt () ;
		for(i=0;i<n;i++){
			queue.add(input.nextInt()) ;
		}
		for(i=0;i<n;i++){
			for(j=0;j<queue.size()-1;j++){
				 int temp=queue.peek() ;
				 queue.remove() ;
				 queue.add(temp) ;
			}
			ans.add(queue.peek()) ;
			queue.remove() ;
		}
		for(i=0;i<n;i++){
			out.println(ans.remove()) ;
		}
	
	}
}
