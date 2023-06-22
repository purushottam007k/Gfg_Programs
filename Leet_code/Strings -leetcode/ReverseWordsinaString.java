
public class ReverseWordsinaString {
	public static void reverseWords(String s) {
        String noSpaces =  s.replaceAll("\\s+"," ").trim();
        String [] arr= noSpaces.split(" ");
        String result="";
        for(int i=arr.length-1;i>=0;i--)
        {
            
            if(i!=0){
            result+=arr[i]+" ";
            }
            else
            {
                result+=arr[i];
            }

        }
        System.out.println( result);
	}

	public static void main(String[] args) {
		
       String str ="swaraj kakade";
       reverseWords(str);
       
	}

}
