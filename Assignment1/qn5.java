public class qn5{
	public static void main(String [] args) {
		int arr [] =new int [6] ;
		arr[0]=18 ;
		arr[1]=9 ;
		arr[2]=33 ;
		arr[3]=4 ;
		arr[4]=84 ;
		arr[5]=32 ;
		int key ;
		
		for(int i=1;i<6;i++) {
			key=arr[i] ;
			int j=i-1 ;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j] ;
				j-- ;
			}
			arr[j+1]=key ;
			
		}
		for(int p=0;p<6;p++) {
			System.out.println(arr[p]) ;
		}
	}
}