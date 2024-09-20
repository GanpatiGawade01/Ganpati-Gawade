package Question_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Department
{
	  public static void main(String[] args) 
	  {
                HashMap map = new HashMap<>();
                map.put("Hr", "sanket");
                map.put("software", "javale");
                map.put("Testing","Prathamesh");
                
                
		  
		   
		   System.out.println(map);
		   
		   Set s = map.entrySet();
		   
		   
		   
			Iterator itr = s.iterator();
		   while(itr.hasNext())
		   {
			   Object o = itr.next();
			   
			 
			   
			   System.out.println(o);
		   }
		
	}
	}


