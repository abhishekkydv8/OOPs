public class qn7 {
	public static void main(String [] args) {
		int n=5 ;
		double s=0 ;
		for(double j=1 ;j<=n; j++) {
			s=s+j/fac(j) ;
		}
		System.out.print(s) ;
	}
	static double fac(double k) {
	 	double s=1 ;
		for (double p=1;p<=k;p++) {
			s=s*p ;
		}
		System.out.println(s+" ") ;
		return s ;
	}
}

