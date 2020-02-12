package exam1;

import java.util.Scanner;

public class QueueReverse extends Queue{
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in) ;
		int m ;
		Queue queue = new Queue () ;
		int k= input.nextInt();
		for(int i=0;i<k;i++) {
			int temp=input.nextInt() ;
			queue.add(temp) ;
		}
		for(int i=0;i<k;i++) {
			for(int j=0;j<queue.size()-1;j++) {
				 m = queue.remove();
				 //System.out.println(m) ;
				 queue.add(m);
			}
			int l=queue.remove() ;
			System.out.println(l) ;
		}
			
	}
}
