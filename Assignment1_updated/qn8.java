import java.util.* ;
public class subarray{
	public  static void main(String [] args){
		Scanner input = new Scanner (System.in) ;
		int n,i,sum,left=0,right=0,temp=0 ;
		n=input.nextInt() ;
		int arr [] = new int [n] ;
		for(i=0;i<n;i++){
			arr[i]=input.nextInt() ;
		}
		sum=arr[0] ;
		for(i=0;i<n;i++){
			temp=temp+arr[i] ;
			if(temp<0)
				temp=0 ;
			if(sum<temp)
				sum=temp ;
		}
		System.out.println(sum) ;
	}
}
