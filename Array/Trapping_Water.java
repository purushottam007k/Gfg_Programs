
public class Trapping_Water {

	public static void main(String[] args) {
		int arr[]={3,0,0,2,0,4};
      int left[]=new int[6];
      left[0]=arr[0];
      for(int i=1;i<arr.length;i++)
      {
      	left[i]=Math.max(left[i-1],arr[i]);
      }
      System.out.println(Arrays.toString(left));
      int right[]=new int[6];
      right[6-1]=arr[6-1];
      for(int i=arr.length-2;i>=0;i--)
      {
      	right[i]=Math.max(right[i+1],arr[i]);
      }
      System.out.println(Arrays.toString(right));
      int c =0;
      for(int i=0;i<arr.length;i++)
      {
      	int avg =Math.min(left[i], right[i]);
      	c+=avg-arr[i];
      }
      System.out.println(c);
	}

}
