
public class MaxCircularSubarraySum {

	public static void main(String[] args) {
		int N = 9;
				int arr[] = {-3 ,-18 ,-22 ,-21 ,-17, 16, -14, 28, -22};
//				Output:
//				22
				int sum=0;
				int a=Integer.MIN_VALUE;
				for(int i=0;i<N;i++)
				{
					for(int j=i;j<N;j++) {
						if(i==0) {
						 sum+=arr[j];
						 if(sum>a)e
						 {
							 a=sum;
						 }
						 if(j==N-1)
						 {
							 sum=0;
						 }
						}
						if(i>=1 )
						{
							sum+=arr[j];
							if(sum>a)
							{
								a=sum;
							}
							
							if(j==N-1) {
						for(int k=0;k<i;k++)
						{
							sum+=arr[k];
							if(sum>a)
							{
								a=sum;
							}
							if(k==i-1)
							{
								sum=0;
							}
							
						}
							}
						}
				}
				}
				System.out.println(a);
	}

}
