package General_Java_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Srting_Duplicates_HashMap {

	public static void main(String[] args) {
		
		
		String s="hi how are are hi";
		
		String[] ss=s.split(" ");
		
		Map<String,Integer> map=new HashMap();
		
		
		
		
		for(String input:ss) {
			
			if(map.containsKey(input)) {
				
				map.put(input, map.get(input)+1);
			}else
			{
				map.put(input, 1);
				
			}
			
			Iterator it=map.entrySet().iterator();
			
			while(it.hasNext()) {
				
				String out=it.next().toString();
				
				System.out.println(out);
				
			}
			
			
			
		}
		
		

	}

}
