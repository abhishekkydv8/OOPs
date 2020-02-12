public class qn4{
	public static void main(String [] args) {
		int x=5 ;
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*") ;
			}
			System.out.println();
		}
		
		for(int i=1;i<x;i++) {
			for(int j=x-i;j>=1;j--) {
				System.out.print("*") ;
			}
			System.out.println();
		}
	}
	
}
