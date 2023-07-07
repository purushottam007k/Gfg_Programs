package hashing;

import java.util.HashMap;

public class Subarray_sum_equal_to_k {

	public static void main(String[] args) {

		int arr[]= {10,2,-2,-20,10};
		int sum =0;
		int k=-10;
		int ans =0;
		HashMap<Integer,Integer> hs =new HashMap<>();
		hs.put(0, 1);
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(hs.containsKey(sum-k))
			{
				ans+=hs.get(sum-k);
			}
			else if(hs.containsKey(sum))
			{
				hs.put(sum, hs.get(sum)+1);
			}
			else 
			{
			hs.put(sum, 1);
			}
		}
	 System.out.println(ans);
		
		
	}

}
