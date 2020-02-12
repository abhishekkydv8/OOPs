import java.util.Scanner ;
class qn10{
	public static void main(String [] args){
		Scanner input= new Scanner(System.in) ;
		int m=input.nextInt() ;
		int n=input.nextInt() ;
		int p=input.nextInt() ;
		int q=input.nextInt() ;
		
		int arr [][] =new int [m][n] ;
		int arr1 [][] =new int [p][q] ;
		int res [][] =new int [m][q] ;

		int i,j,k ;
		for(i=0;i<m;i++)
			for(j=0;j<n;j++){
				arr[i][j]=input.nextInt() ;

			}
                for(i=0;i<p;i++)
                        for(j=0;j<q;j++){
                                arr1[i][j]=input.nextInt() ;

                        }

		for(i=0;i<m;i++){
			for(j=0;j<q;j++){
				for(k=0;k<n;k++){
					res[i][j]=res[i][j]+arr[i][k]*arr1[k][j];
				}
			}
		}

                for(i=0;i<m;i++){
                        for(j=0;j<q;j++){
                                System.out.print(res[i][j]+" ") ;

                        }
			System.out.println();
		}
	}
}
