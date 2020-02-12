import java.util.* ;
public class test7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		LinkedList ll =new LinkedList <Book> () ;
		Book book[] = new Book [100] ;
		int n=0 ;
		while(true) {
			System.out.println("1.Add Book\n2.Delete Book\n4.Display Female Authors") ;
			int k= input.nextInt() ;
			switch(k) {
			case 1:{
				book[n]=new Book() ;
				book[n].book_title=input.next();
				book[n].price=input.nextDouble() ;
				book[n].author.name=input.next() ;
				book[n].author.email_id=input.next() ;
				book[n].author.phone_number=input.next() ;
				book[n].author.gender=input.next() ;
				n++ ;
				break ;
			}
			case 4:{
				for(int i=0;i<n;i++) {
					System.out.println(book[i].book_title);
					System.out.println(book[i].price);
					System.out.println(book[i].author.name);
					System.out.println(book[i].author.email_id);
					System.out.println(book[i].author.phone_number);
					System.out.println(book[i].author.gender+"\n");
					
				}
				break ;
			}
			case 3:{
				for(int i=0;i<n;i++) {
					if(book[i].author.gender.equalsIgnoreCase("female"))
						System.out.println(book[i].author.name);
				}
				break ;
			}
			
			case 2:{
				String str=input.next() ;
				for(int i=0;i<n;i++) {
					if(str.equalsIgnoreCase(book[i].book_title)) {
						for(int j=i;j<n-1;j++)
							book[j]=book[j+1] ;
						n-- ;
					}
				}
				break ;
			}
			
			case 5:return ;
			
			}
		}

	}

}
