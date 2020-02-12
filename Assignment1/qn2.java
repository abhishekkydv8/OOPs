import java.util.Scanner ;
class qn2{
	public static void main(String args[]){
                System.out.println("Enter the size of array") ;
                Scanner input=new Scanner(System.in);
                int n= input.nextInt() ;
                int arr[]=new int[n] ;
                int i,j,key ;
                for(i=0;i<n;i++){
                        arr[i]=input.nextInt() ;
                }

                for(i=1;i<n;i++){
                        j=i-1 ;
                        key=arr[i];
                        while(j>=0 && key<arr[j]){
                                arr[j+1]=arr[j] ;
                                arr[j]=key ;
                                j-- ;
                        }
                }
		System.out.println() ;
                for(i=0;i<n-1;i++){
                        if(arr[i]==arr[i+1]){
				i++ ;
                  
                        }
			else System.out.println(arr[i]) ;
                }
		if(i==n-1)
			System.out.println(arr[i]) ;
                
	}
}
