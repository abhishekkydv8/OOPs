import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
		int n = input.nextInt() ;
		Video v [] = new Video [n] ;
		for(int p=0;p<n;p++)
			v[p]= new Video () ;
		
		int j=0,k ;
		while (true) {
			String ch = input.next() ;
			
			switch(ch){
				case "i" :{
					v[j].title = input.next();
					j++ ;
					break ;
				}
				case "R" :{
					String str = input.next() ;
					for(k=0;k<j;k++) {
						if(v[k].title.equalsIgnoreCase(str))
							break ;
					}
					if(v[k].status==0)
						System.out.println("Already Rented") ;
					v[k].status = 0 ;
					break ;
				}
				case "C" :{
					String str = input.next();
					for(k=0;k<j;k++) {
						if(v[k].title.equalsIgnoreCase(str))
							break ;
					}
					v[k].status = 1 ;
					break ;
				}
				case "r" :{
					String str = input.next();
					int temp = input.nextInt();
					for(k=0;k<j;k++) {
						if(v[k].title.equalsIgnoreCase(str))
							break ;
					}
					double q=v[k].rating + temp ;
					v[k].rating =q ;
					v[k].count++ ;
					break ;
				}
				case "a" :{
					String str = input.next();
					for(k=0;k<j;k++) {
						if(v[k].title.equalsIgnoreCase(str))
							break ;
					}
					if(v[k].count==0)
					System.out.println("No rating given") ;
					else {
					    double temp1 = v[k].rating / v[k].count ;
						System.out.println(temp1) ;
					
					}
					break ;
				}
				
				case "p" :{
					for(k=0;k<j;k++) {
						if(v[k].status==1)
							System.out.println(v[k].title) ;
					}
					break ;
				}
				case "S" :{
					String str = input.next();
					for(k=0;k<j;k++) {
						if(v[k].title.equalsIgnoreCase(str))
							break ;
					}
					if(v[k].status==0)
						System.out.println("Rented") ;
					else System.out.println("Available") ;
					break ;
				}
			}
		}

	}

}

