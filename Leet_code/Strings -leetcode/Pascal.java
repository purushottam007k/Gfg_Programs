import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {
	
	private int factorial(int i) {
			if(i==0)
			{
				return 1;
			}
			return i*factorial(i-1);
		}	
	
	 	public List<List<Integer>> generate(int numRows) {	 		
	 		List<List<Integer>> lli = new ArrayList<>();
			for(int i=0;i<numRows;i++)
			{
				List<Integer> li = new ArrayList<>();
				for (int j = 0; j <=i; j++) {			
					li.add(factorial(i)/(factorial(i-j)*factorial(j)));   
				}
				lli.add(li);
			}	 		
	 		return (lli);
	 	}	
	 
	 			
	 		
	 		
	 		
	 		
	 	
	
	public static void main(String[] args) {
		int numRows =0;
		Solution1 s =new Solution1();
		System.out.println(s.generate(numRows));
	
	}

}
