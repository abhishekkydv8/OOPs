public class Manager extends Worker{
	String department ;
	
	public void showDetails() {
		super.showDetails() ;
		System.out.println("Department :"+department) ;
	}
	public void getsalary(){
		salary=30000+joblevel*25000 ;
	}
}
