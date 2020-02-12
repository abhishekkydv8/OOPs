import java.util.*;

public class SortedList extends List{
	
	public void add(int d) {
		Node newnode =new Node(d) ;
		size++ ;
		if(head==null)
			head=newnode ;
		else if (head.data>d){
				newnode.next=head ;
				head=newnode ;
		}
		
		else {
			Node temp=head ;
			while(temp.next!=null && temp.next.data<d)
				temp=temp.next ;
			Node temp1=temp.next ;
			newnode.next=temp1 ;
			temp.next=newnode ;
			
		}
	}
}
