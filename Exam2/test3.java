import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
	    Professional professional [] = new Professional [100] ;
	    Armature armature [] = new Armature [100] ;
	    Fancy fancy [] = new Fancy [100] ;
	    int p1=0,p2=0,p3=0,i ;
		int k= 0 ;
	
		while(true) {
				int n = input.nextInt() ;
				switch(n) {
					case 1: {
							int j = input.nextInt() ;
							if(j==1) {
								professional [p1] = new Professional () ;
								professional [p1].number=input.nextInt() ;
								professional [p1].ranking=input.nextInt() ;
								professional [p1].finishtime=input.next() ;
								p1++ ;
							}
							if(j==2) {
								armature[p2] = new Armature() ;
								armature[p2].number=input.nextInt() ;
								armature[p2].finishtime=input.next() ;
								armature[p2].count = input.nextInt() ;
								for(i=0;i<armature[p2].count;i++) {
									armature[p2].sponsher[i]=new Sponsher() ;
									armature[p2].sponsher[i].name = input.next() ;
									armature[p2].sponsher[i].amount = input.nextInt() ;
								}
								p2++ ;
							}
							
							if(j==3) {
								fancy[p3] = new Fancy() ;
								fancy[p3].number=input.nextInt() ;
								fancy[p3].costume=input.next();
								fancy[p3].finishtime=input.next() ;
								fancy[p3].count = input.nextInt() ;
								for(i=0;i<fancy[p3].count;i++) {
									fancy[p3].sponsher[i]=new Sponsher() ;
									fancy[p3].sponsher[i].name = input.next() ;
									fancy[p3].sponsher[i].amount = input.nextInt() ;
								}
								p3++ ;
							}
								
							break ;
						}
					
					case 2: {
							for(i=0;i<p1;i++)
								professional[i].print();
							for(i=0;i<p2;i++)
								armature[i].print();
							for(i=0;i<p3;i++)
								fancy[i].print();
						break ;
					}
					case 3: {
						return ;
					}
				}
		}

	}

}
