package exam1;

public class Stack { 
	static final int MAX = 1000; 
	int top; 
	int a[] = new int[MAX]; 

	Stack() 
	{ 
		top = -1; 
	} 

	void push(int x) 
	{ 
			a[++top] = x; 
	} 

	boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
	
	int pop() 
	{ 
		if (top < 0) { 
			return 0; 
		} 
		else { 
			int x = a[top--]; 
			return x; 
		} 
	} 

	int peek() 
	{ 
		if (top < 0) { 
			return 0; 
		} 
		else { 
			int x = a[top]; 
			return x; 
		} 
	} 
} 

