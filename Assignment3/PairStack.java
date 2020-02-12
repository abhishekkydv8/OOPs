
public class PairStack extends Stack {
	Stack s1=new Stack();
	Stack s2=new Stack();
	int a,b ;
	void push(int x,int y)
	{
		s1.push(x);
		s2.push(y);
	}
	public int pop()
	{
		a=s1.pop();
		b=s2.pop();
		return 0;
		
		
	}
	public int size() {
		return s1.size() ;
	}
}
