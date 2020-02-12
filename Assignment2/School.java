public class School {
	String sch_name ;
	int est_year ;
	School(){
		sch_name="DEFAULT" ;
		est_year= 2000 ;
	}
	School(String sch_name){
		this.sch_name=sch_name ;
		est_year= 2000 ;
	}
	School(String sch_name, int est_year){
		this.sch_name=sch_name ;
		this.est_year= est_year ;
	}
	public void getMethod(){
		System.out.println(sch_name) ;
		System.out.println(est_year) ;
	}
}