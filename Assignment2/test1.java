import java.util.Scanner ;
public class test1 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in) ;
		Rectangle sq = new Square(input.nextDouble()) ;
		sq.perimeter();
		sq.area();
	}
}