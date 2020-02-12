package exam1;

public class LinkedList {
	static Node head ;
	static int size1 =0;
	static class Node{
		int data ;
		Node next ;
		Node(int d){
			data = d ;
		}
	}
	
	public static void add(int t) {
		Node newnode = new Node(t) ;
		size1++ ;
		newnode.next = null ;
		if (head == null) { 
            head = newnode; 
        } 
        else { 
            Node last = head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            last.next = newnode; 
        }
	}
	
	public static int remove() {
            Node last = head;  
            head = head.next;
            size1-- ;
            return last.data ;
	}
	
	public static int size() {
		return size1 ;
	}
	
}
