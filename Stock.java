// This program finds the maximum profit for a buying and selling a stock when we know the price in advance in theta(n) time.
public class Stock {
    public static void main(String[] args){
        int parr[]={1,5,3,8,12};
        System.out.println(maxprofit(parr));
    }
    public static int maxprofit(int price[]){
        int n= price.length;
        int profit =0;
        for(int i=1; i<n; i++){
            if(price[i]>price[i-1])
                profit+= price[i]-price[i-1];
        }
        return profit;
    }
}
