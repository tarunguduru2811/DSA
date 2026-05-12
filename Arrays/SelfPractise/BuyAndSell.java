package Arrays.SelfPractise;

public class BuyAndSell {


    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        int maxProfit = 0;
        
        //we need to buy at min price and sell at max 
        int minBuy = prices[0];

        for(int i=1;i<prices.length;i++){
            //check that is it the min price than our current buy so that we can buy at min
           if(prices[i] < minBuy){
                minBuy = prices[i];
           }

           //check the profit if we sell at current price and if it produces more profit update maxprofit
           if(prices[i] - minBuy > maxProfit){
             maxProfit = prices[i] - minBuy;
           }
            
            
        }
        

        System.out.println(maxProfit);

    }
}


// [7,1,5,3,6,4]

// maxProfit = 0
// minBuy = 7

// i=1
// minBuy = 1

// 1-1 =0 > 0 x

// i=2
// minBuy = 1
// 5-1 = 4 > 0 => maxProfit =4

// i=3
// minBuy = 1
// profit = 2 > 4 x

// i=4
// minBuy = 1
// profit = 6-1 => 5 > 4 => maxProfit = 5

// i=5
// minBuy=1
// profit = 4 - 1 = 3 > 5 x

// maxProfit = 5