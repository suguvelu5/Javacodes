package General_Java_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class String_countWords_HashMap {

	public static void main(String[] args) {


		
		String input = "how Sugashini How are you are you ok";
		
		Map<String, Integer> map=new HashMap();
		
		String[] s=input.split(" ");
		
		for(String ss: s) {
			
           
			if(map.containsKey(ss)) {
				
				map.put(ss, map.get(ss)+1);
			}else
			{
				map.put(ss, 1);
			}
            
		
			Set<Entry<String, Integer>> entryset = map.entrySet();
			
				for(Entry<String , Integer> entry:entryset) {
				
				int count=entry.getValue();
				
				if(count>=1) {
					System.out.println(entry.getKey()+":"+entry.getValue());
				}
				
			}
			
			
			
			
		}
		
		
		

	}

}
