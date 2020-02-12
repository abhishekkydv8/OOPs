package assignment3;

public class A extends Marks{
	double marks1,marks2,marks3 ;
	A(double marks1,double marks2,double marks3){
		this.marks1=marks1 ;
		this.marks2=marks2 ;
		this.marks3=marks3 ;
	}
	double getPercentage() {
		double k= (marks1+marks2+marks3)/3.0 ;
		return k ;
	}

}