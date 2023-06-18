import java.util.ArrayList;

public class Subarraywithgivensum {

	public static void main(String[] args) {
		int runningSum = 0;
		int n = 5; int s = 12;
    	int arr[] = {1,2,3,7,5};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        
        if (s == 0) {
            list.add(-1);
           // return list;
        }
        
        while (j < n) {
            runningSum += arr[j];
            while (runningSum > s) {
                runningSum -= arr[i];
                i++;
            }
            
            if (runningSum == s) {
                list.add(i+1);
                list.add(j+1);
                System.out.print(i+1+" "+j+1);
                
            }
            
            
            j++;
            
            
        }
        
        
        if (list.size() == 0) {
            list.add(-1);
        }
        
        
 /********************************************************************/
        //Mysolution
       // return list;

//		 ArrayList<Integer> lis =new ArrayList<>();
//		int n = 5; int s = 12;
//				int arr[] = {1,2,3,7,5};
//	        
//	        int sum=0;
//	        int i=0;
//	        int j=0;
//	        while(i<n)
//	        {
//	            //sum+=arr[i];
//	            
//	            j=i;
//	            while(j<n)
//	            {
//	                sum+=arr[j];
//	                if(sum ==s)
//	                {
//	                    lis.add(i+1);
//	                    lis.add(j+1);
//	                    System.out.print(i+1+" "+j+1);
//	                }
//	                if(j==n-1)
//	                {
//	                    sum=0;
//	                }
//	                
//	                j++;
//	            }
//	            i++;
//	            
//	        }
	        

	}

}
