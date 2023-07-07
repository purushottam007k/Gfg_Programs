package hashing;

import java.util.HashMap;

public class Valid_Anagram {

	public static void main(String[] args) {
		String a ="Swaraj";
		String b ="waratS";
		HashMap<Character,Integer>hm = new HashMap<>();
		for(int i =0;i<a.length();i++)
		{
			hm.put(a.charAt(i), hm.getOrDefault(a.charAt(i), 0)+1);
		}
		System.out.println(hm);
		for(int i=0;i<b.length();i++)
		{
			if(hm.get(b.charAt(i))!=null)
			{
				if(hm.get(b.charAt(i))==1)
				{
					hm.remove(b.charAt(i));
				}
				else
				{
					hm.put(b.charAt(i), hm.get(b.charAt(i))-1);
				}
			}
			
				
		}
		System.out.println(hm.isEmpty());

	}

}
