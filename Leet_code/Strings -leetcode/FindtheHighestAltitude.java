import java.util.ArrayList;
import java.util.Collections;

public class FindtheHighestAltitude {

	public static void main(String[] args) {
		int []gain = {-5,1,5,0,-7};
		ArrayList<Integer> alt = new ArrayList<>();
	       alt.add(0);
	       int a =0;
	       for(int i=0;i<gain.length;i++)
	       {         
	            a =a+gain[i];
	            alt.add(a);
	       }
	      Collections.sort(alt);
	      //System.out.println(alt);
	      System.out.println((Collections.max(alt)));
	}

}
