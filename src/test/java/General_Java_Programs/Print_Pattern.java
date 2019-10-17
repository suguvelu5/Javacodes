package General_Java_Programs;

public class Print_Pattern {

	public static void main(String[] args) {

/*
      1                 1
     1 2              1 2 1
    1 2 3           1 2 3 2 1
   1 2 3 4 
  1 2 3 4 5
 
 */
		
    int n=5;
    int j=0;
    
    for(int i=1;i<=n;i++) {
    	
  
    	System.out.println(" ");
    	for( j=i; j<=n;j++) {
    		
    		System.out.print(" ");
    	}
    
    	
    	for(int k=1; k<=i; k++) {
    		
    		System.out.print(" "+k);
    		    		
    	}
    	    	
    	 
    }
		
		
		
		
		

	}

}
