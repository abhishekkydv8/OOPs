import java.util.* ;
public class test11 {
	public static boolean isPrime(int num) {
		int count=0 ;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		if(count==2)
			return true ;
		else return false ;
	}
	
	
	public static boolean isPalindrome(int num) {
		Queue <Integer> queue = new LinkedList <> () ;
		int temp,q=5,num1 ;
		num1=num ;
		while(q!=0) {
			temp=num1%10 ;
			q=num1/10 ;
			queue.add(temp) ;
			num1=q;
		}
		num1=0 ;
		while(queue.size()>0)
			num1=num1*10+queue.remove() ;
		if(num==num1)
			return true ;
		else return false ;
		
	}
	
	public static void main(String[] args) {
		int k,num ;
		Scanner input = new Scanner (System.in) ;
		System.out.println("1.To check for prime number\n2.To check for palindrome\n3.Exit") ;
		while(true) {
			k=input.nextInt() ;
			switch(k) {
			case 1:
				System.out.println("Enter the number");
				num=input.nextInt() ;
				if(isPrime(num))
					System.out.println("Given number is Prime");
				else System.out.println("Given number is not Prime");
				break ;
				
			case 2:
				System.out.println("Enter the number");
				num=input.nextInt() ;
				if(isPalindrome(num))
					System.out.println("Given number is Palindrome");
				else System.out.println("Given number is not Palindrome");
				break ;
				
			case 3: return ;
			}
			
		}

	}

}
