package assignment3;

public class test1 extends Bank{

	public static void main(String[] args) {
		Bank x = new Bank() ;
		BankA a= x.new BankA() ;
		BankB b= x.new BankB() ;
		BankC c= x.new BankC() ;
		System.out.println("$"+x.getBalance()) ;
		System.out.println("$"+a.getBalance()) ;
		System.out.println("$"+b.getBalance()) ;
		System.out.println(c.getBalance()) ;
		return ;
	}

}
