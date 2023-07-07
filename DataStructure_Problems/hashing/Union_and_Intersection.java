package hashing;

import java.util.HashSet;

public class Union_and_Intersection {

	public static void main(String[] args) {
		HashSet<Integer>hs = new HashSet<>();
		int arr[]= {7,3,9};
		int arr2[]= {6,3,9,2,9,4};
		for(int i=0;i<arr.length+arr2.length;i++) {
			if(i<arr.length) {
			hs.add(arr[i]);
			}
			if(i<arr2.length) {
			hs.add(arr2[i]);
			}

			
		}
		System.out.println(hs);
		hs.clear();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(hs.contains(arr2[i]))
			{
				System.out.print(arr2[i]+" ");
				hs.remove(arr2[i]);
			}
		}
		
	

	}

}
