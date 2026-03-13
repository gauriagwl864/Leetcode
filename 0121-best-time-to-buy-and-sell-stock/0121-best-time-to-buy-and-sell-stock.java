// class Solution {
//     public int maxProfit(int[] prices) {
//         int ans=0;
//         for(int i=0;i<prices.length;i++){
//             for(int j=i+1;j<prices.length;j++){
//                 if(prices[i]<prices[j]){
//                     int diff=prices[j]-prices[i];
//                     ans=Math.max(ans,diff);
//                 }
//             }
//         }
//         return ans;
//     }
// }

class Solution {
    public int maxProfit(int[] prices){
        int min=Integer.MAX_VALUE;
        int max=0;
        int ans=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int diff=prices[i]-min;
            if(diff>max){
                max=diff;
            }
        }
        return max;
    }
}