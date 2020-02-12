public class test2 {

	public static void main(String[] args) {
		Employee employee =new Employee() ;
		employee.name="Adarsh" ;
		employee.age=21 ;
		employee.phonenumber="8789810591" ;
		employee.address="G hostel, room number 127" ;
		employee.joblevel=3 ;
		employee.specialisation="Java" ;
		employee.getsalary();
		employee.showDetails() ;
		
		System.out.println();
		Manager manager =new Manager() ;
		manager.name="Abhishek yadav" ;
		manager.age=21 ;
		manager.phonenumber="9838146070" ;
		manager.address="PG1 hostel, room number 342" ;
		manager.joblevel=3 ;
		manager.department="cse" ;
		manager.getsalary();
		manager.showDetails() ;
	}

}
