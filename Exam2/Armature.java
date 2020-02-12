public class Armature {
	int number ;
	String finishtime ;
	int count ;
	Sponsher sponsher [] = new Sponsher [100] ; 
	
	public void print() {
		int total=0 ;
		System.out.print("Runner "+number+" sponshers ") ;
		for(int i=0;i<count;i++) {
			System.out.print(sponsher[i].name+" - "+sponsher[i].amount) ;
			System.out.print(", ") ;
			total+=sponsher[i].amount ; 
		}
		if(finishtime.equalsIgnoreCase("0:0:0"))
			System.out.println(" Total "+total+", Not finished") ;
		else System.out.println(" Total "+total+", Finished in "+finishtime) ;
	}
}
