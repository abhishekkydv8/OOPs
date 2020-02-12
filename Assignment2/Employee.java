public class Employee extends Worker{
	String specialisation ;
	public void showDetails() {
		super.showDetails() ;
		System.out.println("Specialisation :"+specialisation) ;
	}
	public void getsalary(){
		salary=20000+joblevel*25000 ;
	}
}
