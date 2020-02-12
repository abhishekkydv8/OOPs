public class test4 {

	public static void main(String[] args) {
		Student st1=new Student() ;
		st1.rollno="B170414CS" ;
		st1.stu_name="Adarsh" ;
		st1.address=new Address("3B","Calicut","Kerala","India") ;
		System.out.println(st1.stu_name+" "+st1.rollno+" "+st1.address.streetnum+" "+
							st1.address.city+" "+st1.address.state+" "+st1.address.country) ;
	}

}
