import java.util.Scanner;

public class Book14 extends Publication{
	int page_count ;
	public void getData() {
		super.getData() ;
		System.out.println("Enter pagecount") ;
		Scanner input = new Scanner (System.in) ;
		this.page_count=input.nextInt();
	}
	public void putData() {
		super.putData();
		System.out.println("Page_count : "+page_count) ;
	}
}
