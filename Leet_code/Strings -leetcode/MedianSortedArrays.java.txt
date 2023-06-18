import java.util.Arrays;

public class leet {
	static public double  findMedianSortedArrays(int[] nums1, int[] nums2) {
	        
	        
	        int[] mergedArr= new int[nums1.length+nums2.length];   
//	        double num1=0;
//	        double num2=0;
//	         if(nums1.length>0){
//	               num1 = nums1[nums1.length-1];
//	            }
//
//	            if(nums2.length>0 ){
//	                 num2 = nums2[0];
//	            }

	        for(int i=0;i<mergedArr.length;i++)
	        {   
	            if(i<nums1.length)   
	            {
	            mergedArr[i]=nums1[i];
	            }
	            else
	            {
	                mergedArr[i]=nums2[i-nums1.length];     
	            }      
	            
	        }      
	        Arrays.sort(mergedArr);
	        if(mergedArr.length%2==0){
	            double median = (mergedArr[(mergedArr.length)/2-1]+mergedArr[(mergedArr.length)/2])/2.0;
	            return median;
	        }
	        else
	        {
	          return mergedArr[mergedArr.length/2];
	        }
	       
	      
	    }
	 public static void main(String[] args) {
		 int num1[]= {1,2,3,4,5};
		 int num2[]= {6,7,8,9,10};
		//{1,2,3,4,5,6,7,8,9,,10}
		 System.out.println(findMedianSortedArrays(num1,num2));
	}
	}


