import java.util.* ;
public class PermutationString{
	public static void main(String [] args)	{
		Scanner input = new Scanner (System.in) ;
		String s = input.next() ;
		permutationString(s,"") ;
	}

	static void permutationString (String str,String ans){
			if(str.length()==0){
				System.out.print(ans + " ");
				return ;
			}
			for(int i=0 ;i<str.length() ;i++) {
				char ch = str.charAt(i) ;
				String row = str.substring(0,i)+ str.substring(i+1) ;
				permutationString(row,ans+ch) ;
			
			}
		
		
		}

}
