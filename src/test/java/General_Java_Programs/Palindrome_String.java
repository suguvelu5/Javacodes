package General_Java_Programs;

public class Palindrome_String {

	public static void main(String[] args) {


		String input ="mom";
		
		String re="";
		
		int len=input.length();
		
		for(int i=len-1 ; i>=0 ; i--) {
			
			re=re+input.charAt(i);
			
		}
			
		if(re.equals(input)) {
			
			System.out.println("its palindrome");
		}else {
			System.out.println("No Palindrome");
		}
		

	}

}
