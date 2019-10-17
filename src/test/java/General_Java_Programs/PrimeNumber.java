package General_Java_Programs;

public class PrimeNumber {

	public static void main(String[] args) {

// prime numbers : 2 3 5 7 9 11 13 15 17
		
		
		int n = 20;
		int i;
		int j;
		
		for( i=2; i<n;i++) {
			
			for( j=2; j<n; j++) {
				
				if(i%j==0) {
					
					break;
					
				}
				
			}
			
			if(i==j) {
				
				System.out.println(i);
			}
			
			
		}
		
		
		

	}

}
