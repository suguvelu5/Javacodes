package General_Java_Programs;

public class Palindrome_Integer {

	public static void main(String[] args) {

      int input = 11011;
      
      int out;
      int result = 0;
      
      for(int i=input ; i>0 ; i/=10) {
    	  
    	  
    	  out =input%10;
    	  
    	  result =  result*10 +out;
    	  
    	  input = input/10;
    	  
    	  
      }
		
		System.out.println(result);
		
		if(result==input) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}

	}

}
