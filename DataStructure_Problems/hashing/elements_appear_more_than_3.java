package hashing;

import java.util.HashMap;
import java.util.Set;

public class elements_appear_more_than_3 {

	public static void main(String[] args) {
		int arr[]= {1,3,2,5,1,3,1,5,1};
		int n=9;
		HashMap<Integer,Integer> hm = new HashMap<>();
		int a =1;
		for(int i=0;i<arr.length;i++)
		{
			int num =arr[i];
			if(hm.containsKey(num))
			{
				hm.put(num,hm.get(num)+1 );
			}
			else
			{
				hm.put(num, 1);
			}
		}
		//Above for loop we can write into in one line;
		for(int i=0;i<arr.length;i++)
		{
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		
		
		
			Set<Integer> a1 =hm.keySet(); 
	int a2 =0;
	int a4=0;
		for(Integer k:a1)//for(Integer k:hm.keySet())
		{
			if(a2<(hm.get(k)))
			{
				a2=hm.get(k);
				a4=k;
			}
		}
		System.out.println(a4);
		
	}

}
