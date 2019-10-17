package General_Java_Programs;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterate_List_Element {

	public static void main(String[] args) {
	
		ArrayList list=new ArrayList();
		
		list.add(1);
		list.add("Sugashini");
		list.add(2);
		
		//-----------------------------------------------------------------		
		for(int i=0; i<list.size() ; i++) {
				
			
			System.out.println(list.get(i));
			
		}
       //-----------------------------------------------------------------		
		for(Object n:list) {
			System.out.println(n);
		}
		
		//-----------------------------------------------------------------	
		Iterator it=list.iterator();
		
		while(it.hasNext()) {
			
			Object o=it.next();
			
			System.out.println(o);
		}
		
		
		

	}

}
