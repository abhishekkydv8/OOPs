import java.util.Scanner;

public class Tape extends Publication{
	float playing_time ;
	
	public void getData() {
		super.getData() ;
		System.out.println("Enter playing_time") ;
		Scanner input = new Scanner (System.in) ;
		this.playing_time=input.nextInt();
	}
	public void putData() {
		super.putData();
		System.out.println("Playing_time : "+playing_time) ;
	}
}
