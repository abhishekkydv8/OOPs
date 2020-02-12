import java.util.* ;
public class test6 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
		boolean condition=true ;
		while(condition) {
			System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.division\n5.exit") ;
			int k=input.nextInt() ;
			System.out.println("Enter two numbers") ;
			double a,b ;
			a=input.nextDouble() ;
			b=input.nextDouble() ;
			switch(k) {
			case 1:
				System.out.println(a+b) ;
				break ;
			case 2:
				System.out.println(a-b) ;
				break ;
			case 3:
				System.out.println(a*b) ;
				break ;
			case 4:
				System.out.println(a/b) ;
				break ;
			case 5:
				condition= false ;
			}
		}

	}

}
