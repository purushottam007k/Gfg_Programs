import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class Findduplicatesinanarray {
	public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer>a=new  ArrayList<>();
        TreeMap<Integer,Integer>h =new TreeMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(h.containsKey(arr[i]))
            {
                h.put(arr[i],h.get(arr[i])+1);
            }
            else{
            h.put(arr[i],1);
            }
            
        }
        for(Integer s:h.keySet())
        {
            if(h.get(s)>1)
            {
                a.add(s);
            }
        }
        if(a.isEmpty())
        {
            a.add(-1);
            return a;
        }
        return a;
	}

	public static void main(String[] args) {
	
    
		//System.out.println(Math.max(arr, ));

	}


