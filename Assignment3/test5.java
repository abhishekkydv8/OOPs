package assignment3;

public class test5 {

	public static void main(String[] args) {
		Vehicle bike = new Vehicle() ;
		double speed = bike.speed() ;
		double distance = bike.distance() ;
		double distancetravelled = speed * distance ;
		double averagespeed = distancetravelled / speed ;
		System.out.println(distancetravelled) ;
		System.out.println(averagespeed) ;
	}

}
