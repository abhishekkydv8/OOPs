
public class test4 {

	public static void main(String[] args) 
	{
		PairStack p=new PairStack();
		p.push(5, 10);
		p.push(15, 10);
		p.push(25, 10);
		p.push(35, 10);
		p.push(45, 10);
		p.push(55, 10);
		p.push(65, 10);
		p.push(75, 10);
		p.push(85, 10);
		p.push(95, 10);
		while(p.size()>=0) {
			p.pop();
			System.out.println(p.a+" "+p.b) ;
			
		}
	}

}
