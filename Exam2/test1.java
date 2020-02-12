import java.util.* ;
public class test1 {

	public static void main(String[] args) {
		List l1 = new List () ;
		SortedList l2 = new SortedList () ;
		Scanner input = new Scanner (System.in) ;
		while(true) {
			System.out.println("1.Enter to the intList\n2.Enter to the sorted intList\n"
					+ "3.printIntlist\n4.Printsortedintlist") ;
			int k = input.nextInt() ;
			switch(k) {
				case 1: {
						int a=input.nextInt() ;
						l1.add(a) ;
						break ;
				}
				case 2: {
						int a=input.nextInt() ;
						l2.add(a) ;
						break ;
				}
				case 3: {
						l1.print() ;
						break ;
				}
				case 4: {
						l2.print() ;
				}
			
			}
			
		}

	}

}
