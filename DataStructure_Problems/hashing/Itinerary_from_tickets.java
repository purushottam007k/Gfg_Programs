package hashing;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Itinerary_from_tickets {
	static String fun(HashMap<String,String>hs1)
	{
		HashMap<String,String>hs2 =new HashMap<>();
		for(String k:hs1.keySet())
        {
       	   hs2.put(hs1.get(k), k);
        }
		for(String k:hs1.keySet())
		{
			if(hs2.containsKey(k)==false)
			{
				return k;
			}
		}
		return "";	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=0;
         HashMap<String,String>hs =new HashMap<>();
         hs.put("Delhi","Goa");
         hs.put("chennai","bengallru");
         hs.put("Mumbai","Delhi");
         hs.put("Goa","chennai");
         
        String a1 =fun(hs); 
         while(hs.containsKey(a1))
         {
        	 System.out.print(a1+"->");
        	 a1=hs.get(a1);
         }
         System.out.print(a1);
        
		
		
		
		
		
		
	}

}
