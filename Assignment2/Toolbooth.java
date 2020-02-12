
public class Toolbooth {
	int cars ;
	double money ;
	Toolbooth(){
		cars=0 ;
		money=0;
	}
	public void payingcars() {
		this.cars++ ;
		this.money+=0.50 ;
	}
	public void nonpayCar() {
		this.cars++ ;
	}
	public void displayTotal() {
		System.out.println("Total cars: "+cars);
		System.out.println("Total money: "+money);
	}
}
