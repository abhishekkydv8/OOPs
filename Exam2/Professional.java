public class Professional {
	int ranking ;
	int number ;
	String finishtime ;
	
	public void print() {
		if(finishtime.equalsIgnoreCase("0:0:0"))
			System.out.println("Runner "+number+"(Ranking "+ranking+"),"+" Not finished") ;
		else System.out.println("Runner "+number+"(Ranking "+ranking+"),"+" Finished in "+finishtime) ;
	}
}