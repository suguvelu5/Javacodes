package General_Java_Programs;

public class Fibonaci_Series {

	public static void main(String[] args) {


		
		// Fibonaci serires : 0,1,1,2,3,5,8,13,21
		
        int a=0;
        int b=1;
        int temp=0;
        
        for (int i=0; i<=20; i++) {
        
        	 temp = a+b;
        	 a =b;
        	 b=temp;
        	 System.out.println(temp);
        	
        }
        
       
        
        
		
		
		
	}

}
