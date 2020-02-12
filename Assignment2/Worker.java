public class Worker {
	String name ;
	int age ;
	String phonenumber ;
	String address ;
	int joblevel ;
	int salary ;
	public void printSalary(){
		System.out.println(salary) ;
	}
	
	public void showDetails() {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Phonenumber :"+phonenumber);
		System.out.println("Address :"+address) ;
		System.out.println("Joblevel :"+joblevel);
		System.out.println("Salary :"+salary);
	}
}
