import java.util.* ;

public class test15 {
	public static void main(String[] args) {
		Toolbooth toolbooth = new Toolbooth ();
		int k ;
		Scanner input = new Scanner (System.in) ;
		while(true) {
			System.out.println("1.Paying Cars\n2.Non paying cars\n3.exit");
			k=input.nextInt();
			switch(k) {
			case 1:
				toolbooth.payingcars();
				break ;
			case 2:
				toolbooth.nonpayCar() ;
				break ;
			case 3:
				toolbooth.displayTotal();
				return ;
			}
		}
	}

}
