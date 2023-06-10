
public class Rec {

	public static void main(String[] args) {
		String S="geeksforgeeks";
		String v="forgeeksgeeks";
//		String str[]=S.split("\\.");
//        String d ="";
//        int i=0;
//        for( i=str.length-1;i>=0;i--)
//         {
//            if(i!=0){
//            d+=str[i]+".";
//            }
//            else {
//            d+=str[i];
//            }
//           
//        }
//        System.out.println(d)
		   String str="";
//	        for(int i=S.length()-1;i>=0;i--)
//	        {
//	            str+=S.charAt(i);
//	        }
	        if(str==v)
	        {
	            
	        }
	        else
	        {
	            //return 0;
	        }
//	        Given a string S, check if it is palindrome or not.
//
//	        Example 1:
//
//	        Input: S = "abba"
//	        Output: 1
//	        Explanation: S is a palindrome
         StringBuilder a =new StringBuilder(S);
         StringBuilder s =a.reverse();
         String c =s.toString();
         if(S.equals(c))
	        {
	          // System.out.println("1"); 
	        }
	        else
	        {
	            System.out.println("sds");
	        }
         
         
         
         
         
//         You are given a string S, the task is to reverse the string using stack.
//
//         
//
//         Example 1:
//
//
//         Input: S="GeeksforGeeks"
//         Output: skeeGrofskeeG
         StringBuilder str = new  StringBuilder(S);
         StringBuilder f=str.reverse();
         String c= f.toString();
         return c;
  }

}

