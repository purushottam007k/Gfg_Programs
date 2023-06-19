
public class Reverse {
	static String x="";
	static void fun(int a,String str)
	{
		if(a==0)
		{
			System.out.print(str.charAt(a));
			return ;
		}
		System.out.print(str.charAt(a));
		fun( a-1, str);
		
	}

	public static void main(String[] args) {
		String str ="swaraj";
		fun(str.length()-1,str);
	}

}
