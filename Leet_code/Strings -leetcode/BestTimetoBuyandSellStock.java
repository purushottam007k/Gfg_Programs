
public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		int prices[]= {7,1,5,3,6,4};
		int mac=0;
	       
        for(int i=0;i<prices.length;i++)
        {
             int max=0;
            for(int j=i+1;j<prices.length;j++){
                     
                     if(prices[j]>max)
                     {
                         max=prices[j];
                     }
                     if(j==prices.length-1){
                     if((max-prices[i])>=1)
                     {

                        
                         int a =max-prices[i];
                         if(a>mac)
                         {
                             mac=a;
                         }
                     }
                     
                     }

            }
           
           
        }
        System.out.println(mac); 

	}

}
