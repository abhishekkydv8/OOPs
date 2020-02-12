import java.util.* ;

public class Publication {
	String title ;
	float price ;
	public void getData() {
		Scanner input = new Scanner (System.in) ;
		System.out.println("Enter the title") ;
		this.title=input.next();
		System.out.println("Enter the price") ;
		this.price=input.nextFloat();
	}
	public void putData() {
		System.out.println("Title : "+title) ;
		System.out.println("Price : "+price) ;
	}
}
