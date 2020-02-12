public class qn1 {
	public static void main(String [] args) {
	int [] arr =new int [6] ;
	arr[0]=1 ;
	arr[1]=4 ;
	arr[2]=45 ;
	arr[3]=6 ;
	arr[4]=10 ;
	arr[5]=-8 ;
	for(int i=0;i<6;i++) {
		for(int j=i+1;j<6;j++) {
			if(arr[i]+arr[j]==16)
					System.out.println(arr[i]+" "+arr[j]) ;
		}
	
	}
}
}
