package General_Java_Programs;

public class String_Anagaram {

	public static void main(String[] args) {


		String one="listen";       String two="silent";
		
		StringBuffer sb=new StringBuffer();
		
		sb.append(one);
		
		int index = 0;
		
		char[] ch=two.toCharArray();
		
		for(char c:ch) {
			
			
			 index=sb.indexOf(""+c);   // indexOf accepts string.. but c is a character.. so just nothing appeneded with character so its make it as string
			
			if(index!=-1) {
				
				sb.deleteCharAt(index);
			}else {
				
				System.out.println("its not anagram");
			}
					
		}
		
		
		 if(index==0) {
			 
			 System.out.println("its anagram");
		 }
		
		

	}

}
