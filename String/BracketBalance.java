import java.util.Stack;

public class BracketBalance {

	public static void main(String[] args) {
       Stack c= new Stack();
       String str="([]";
       char[]a=str.toCharArray();
       for(int i =0;i<a.length;i++)
       {
    	   //if(a[i]=='(' || a[i]=='[' ||a[i]=='{' ) {
    	   c.push(a[i]);
    	   //}
       }
       if(c.isEmpty())
       {
    	   System.out.println("false");
       }
       
           char x =(char) c.peek();
    	   if((x!='(' && x==')')|| (x!='[' && x==']') ||(x!='{' && x=='}' )) {
    	       c.pop();
    	       
    	   }
    	   else
    	   {
    		   System.out.println("False");
    	   }
     
       
       
       }
	}

}
