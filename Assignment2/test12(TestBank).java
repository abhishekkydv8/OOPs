import java.util.* ;
public class TestBank {

	public static void main(String[] args) {
		SBI sbi = new SBI() ;
		PNB pnb = new PNB() ;
		Scanner input = new Scanner (System.in) ;
		System.out.println("Enter the name of Bank");
		String str=input.next() ;
		if(str.equalsIgnoreCase("sbi")) 
			System.out.println(sbi.getRateOfInterest()+"%");
		if(str.equalsIgnoreCase("pnb")) 
			System.out.println(pnb.getRateOfInterest()+"%");
	}

}
