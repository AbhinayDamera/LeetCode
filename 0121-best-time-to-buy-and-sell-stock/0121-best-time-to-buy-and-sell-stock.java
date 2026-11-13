// // // class Solution {
// // //     public int maxProfit(int[] prices) {
// // //         int buy_price=prices[0];// minimum price so far
// // //         int profit=0;
// // //         for(int i=1; i<prices.length; i++){
// // //             if(prices[i]<buy_price){
// // //                 // found a lower buying price
// // //                 buy_price=prices[i];
// // //             }
// // //             else{
// // //                 int current_profit=prices[i]-buy_price;
// // //                 profit=Math.max(current_profit,profit);
// // //             }
// // //         }
// // //         return profit;
// // //     }
// // // }

// // // class Solution {
// // //     public int maxProfit(int[] prices) {
// // //         int buy_price=prices[0];
// // //         int profit=0;
// // //         for(int i=1; i<prices.length; i++){
// // //             if(prices[i]<buy_price){
// // //                 buy_price=prices[i];
// // //             }
// // //             else{
// // //                 int current_profit=prices[i]-buy_price;
// // //                 profit=Math.max(current_profit,profit);
// // //             }
// // //         }
// // //         return profit;
// // //     }
// // // }

// // class Solution {
// //     public int maxProfit(int[] prices) {
// //         int buy_price=prices[0];
// //         int profit=0;
// //         for(int i=1; i<prices.length; i++){
// //             if(prices[i]<buy_price){
// //                 buy_price=prices[i];
// //             }
// //             else{
// //                 int current_profit=prices[i]-buy_price;
// //                 profit=Math.max(profit,current_profit);
// //             }
// //         }
// //         return profit;
// //     }
// // }


// // class Solution {
// //     public int maxProfit(int[] prices) {
// //         int buy_price=prices[0];
// //         int profit=0;
// //         for(int i=1; i<prices.length; i++){
// //             if(prices[i]<buy_price){
// //                 buy_price=prices[i];
// //             }
// //             else{
// //                 int current_profit=prices[i]-buy_price;
// //                 profit=Math.max(profit,current_profit);
// //             }
// //         }
// //         return profit;
// //     }
// // }


// // class Solution {
// //     public int maxProfit(int[] prices) {
// //         int min = prices[0];
// //         int maxProfit = 0;

// //         for (int sum : prices){
// //             if(sum<min){
// //                 min =sum;

// //             }
// //             int profit = sum - min;
// //             maxProfit = Math.max(profit,maxProfit);
// //         }
// //         return maxProfit;
// //     }
// // }

// class Solution {
//     public int maxProfit(int[] prices) {
//         int min = prices[0];
//         int maxProfit = 0;

//         for (int i = 1; i < prices.length; i++) {
//             int price = prices[i];

//             if (price < min) {
//                 min = price;
//             }
//             int profit = price - min;
//             maxProfit = Math.max(maxProfit, profit);
//         }

//         return maxProfit;
//     }
// }

class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxProfit=0;

        for(int i=1; i<prices.length; i++){
            int price=prices[i];
            if(price<min){
                min=price;
            }
            int profit=price-min;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}