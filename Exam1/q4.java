package exam1;
import java.util.* ;
public class BinnaryArray {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
		String str= input.next();
		char c1 [] = new char[100] ;
		int j=0 ;
		int count=0 ;
		int temp1=0 ;
		int temp=0,max=0 ;
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i) ;
			if(c=='1') {
				temp++ ;
				if(max<temp)
					max=temp ;
			}
			
			if(c=='0') {
				count++ ;
				temp++ ;
				temp1++ ;
				if(count==2) {
					temp=1 ;
					count=0 ;
				}
			}
		}
		if(temp1==str.length())max=1;
		System.out.println(max) ;
			

	}

}
