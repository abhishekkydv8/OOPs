public class List {
	Node head ;
	int size=0 ;
	class Node{
		int data ;
		Node next = null ;
		Node(int d){
			data=d ;
		}
	}
	
	public void add(int d) {
		Node newnode =new Node(d) ;
		size++ ;
		if(head==null)
			head=newnode ;
		else {
			Node temp=head ;
			while(temp.next!=null)
				temp=temp.next ;
			temp.next=newnode ;
			
		}
	}
	public void print() {
		Node temp=head;
		while(temp.next!=null) {
			System.out.println(temp.data) ;
			temp=temp.next ;
		}
		System.out.println(temp.data) ;
	}
}
