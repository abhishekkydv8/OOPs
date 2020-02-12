package assignment3;

public class B extends Marks{
	double marks1,marks2,marks3,marks4 ;
	B(double marks1,double marks2,double marks3,double marks4){
		this.marks1=marks1 ;
		this.marks2=marks2 ;
		this.marks3=marks3 ;
		this.marks4=marks4 ;
	}
	double getPercentage() {
		double k= (marks1+marks2+marks3+marks4)/3.0 ;
		return k ;
	}

}