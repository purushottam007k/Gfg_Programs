import java.util.Arrays;

public class Solution {
	
	
	 public void maxSubArray(int[] nums) {
		 int sum=0;
		 int a=Integer.MIN_VALUE;
		//System.out.println(a);
		for(int i=0;i<nums.length;i++)
		{
			
				sum+=nums[i];				
				
				if(sum>a)
				{
					a=sum;
				}     
		        
				if(sum<0)
				{				
					sum=0;
				}
				
			
		}
		System.out.println(a);
	 }
	
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		Solution s = new Solution();
		System.out.println(Arrays.toString(nums));
		s.maxSubArray(nums);
		//System.out.println(s.maxSubArray(nums));
	}

}
