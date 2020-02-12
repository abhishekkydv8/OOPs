/*Various situations require that pairs of numbers be treated as a unit. For
example, each screen coordinate has an x (horizontal) component and a y
(vertical) component. Represent such a pair of numbers as a structure called pair
that comprises two int member variable. Now, assume you want to be able to
store pair variable on a stack. That is, you should be able to place a pair (which
contains two integers) on to stack using a single call to a push() function with a
structure of type pair as an argument, and retrieve a pair using a single call to a
pop() function, which will return a structure of type pair.

First, create a class Stack which having standard push() and pop() methods.
From this class derive a new class called PairStack. This new class need contain
only two members: the overloaded push() and pop() functions.*/

//package assign3;

public class Stack 
{	
	int arr [] = new int [1000] ;
	private int size= 0 ;
	void push(int x)
	{
		arr[size]=x ;
		size++ ;
	}
	public int pop()
	{
		if(size==0) {
			System.out.println("Stack is empty");
			return 0 ;
		}
		else {
			size--;
			return arr[size];	
		}
	}
	public int size() {
		return size ;
	}

}