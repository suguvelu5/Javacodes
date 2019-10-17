package General_Java_Programs;

public class String_reverse {

	public static void main(String[] args) {


		
		String s ="hello sugashini";
		
		char[] ch=s.toCharArray();
		
		int len=ch.length;
		
		String reverse="";
		
		for(int i=len-1; i>=0 ;i--) {
			
			
			reverse = reverse + ch[i];
			
		}
		
		System.out.println(reverse);
		
		

	}

}
