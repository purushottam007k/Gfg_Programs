
public class LongestPalindromeinaString {
	static String longestPalin(String S){
		 String s="";
        for(int i=0;i<S.length();i++)
        {
        	for(int j=i;j<S.length();j++) {
           String a= S.substring(i,j+1);
           StringBuilder str =new StringBuilder(a);
            StringBuilder d = str.reverse();
            String c =d.toString();
          
           if(a.equals(c))
           {
        	  
        	   if(a.length()>s.length())
        	   {
        		   s=a;
        	   }
              
              
           }
           if(s!=null && i==S.length()-1)
           {
        	   return s;
           }
           if(i==S.length()-1)
           {
               return S.substring(0,1);
           }
          
           
        }
        }
        return "";      
	}


	public static void main(String[] args) {
		String S="ysfrzrlu";
		//System.out.println(longestPalin( S));
		
	}

}
