package exam1;
import java.util.* ;
public class ExpBalancing {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in) ;
		String str = input.next();
		int count = 0 ;
		int count1= 0;
		int temp=0 ;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i) ;
			if(c=='(') {
				if(count1==temp) {
					count1= count;
					temp=count ;
				}
				count++ ;
				count1++ ;
				System.out.println(count) ;
				//System.out.println("count1 "+ count1) ;
			}
			if(c==')') {
				if(count1==0) {
					System.out.println("string is Invalid") ;
				return ;
				}
				System.out.println(count1) ;
				count1-- ;
			}
			
		}
	}

}
