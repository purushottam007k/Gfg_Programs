package hashing;

import java.util.HashSet;

public class Count_Distinct_Element {

	public static void main(String[] args) {
    HashSet<Integer>hs = new HashSet<>();
	int arr[] = {4,3,2,5,6,7,3,4,2,1};
	for(int i=0;i<arr.length;i++) {
		hs.add(arr[i]);
		
	}
	System.out.println(hs);
	System.out.println(hs.size());
	
	}

}
