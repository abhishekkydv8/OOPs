import java.util.* ;
public class CommonPrefix{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in) ;
		int n = input.nextInt() ;
		String [] str = new String [n] ;
		int i,temp,j,min ;
		for(i=0;i<n;i++){
			str[i]=input.next() ;
		}
		min=100 ;
		for(i=0;i<n;i++){
			temp=str[i].length() ;
			if(temp<min)
				min=temp ;
		}
		int count1=0 ;int count ;
		//System.out.println(min) ;
		for(j=0;j<min;j++){
			char ch=str[0].charAt(j) ;
			count=0 ;
			for(i=0;i<n;i++){
				 if(ch==str[i].charAt(j)) count++ ;
			}
			if(count<n){
				if(count1==0)
					System.out.println("-1") ;
				return ;
			} 
			System.out.print(ch) ;
			count1++ ;
		}
	
	
	}


}
