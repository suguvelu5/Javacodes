package General_Java_Programs;

public class String_Reverse_words_only {

	public static void main(String[] args) {


		
		
		String s ="Hello Sugashini";
		
		String[] input = s.split(" ");
		
		int len = input.length;
		
		String re=" ";
		String word=" ";
		String result=" ";
		String space=" ";
		
		for(int i=0; i<len ; i++) {
			 word = input[i];
			
			int wlen = word.length();
			
			for(int j=wlen-1 ; j>=0 ; j-- ) {
				re =  re + word.charAt(j);
			}
			
		
			
			result = result+space+re;	
	}
	
	
		
		System.out.println(result);

	}

}
