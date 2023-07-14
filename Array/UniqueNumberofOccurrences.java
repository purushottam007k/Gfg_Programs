
public class UniqueNumberofOccurrences {
	 HashMap<Integer,Integer>h1 =new HashMap<>();
     HashSet<Integer>h2 =new HashSet<>();
     for(int i=0;i<arr.length;i++)
     {
         if(h1.containsKey(arr[i]))
         {
              h1.put(arr[i],h1.get(arr[i])+1);
         }
         else
         {
             h1.put(arr[i],1);
         }
        
     }
     for(Integer t :h1.keySet())
     {
         h2.add(h1.get(t));
     }
     if(h1.size()==h2.size())
     {
         return true;
     }
     else
     {
         return false;
     }
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
