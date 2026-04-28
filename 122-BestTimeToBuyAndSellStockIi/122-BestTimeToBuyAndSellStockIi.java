// Last updated: 4/28/2026, 8:03:18 PM
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] buy=new int[n];
        for(int i=1;i<n;i++){
            buy[i-1]=prices[i];
        }
        int[] sell=new int[n];
        for(int i=0;i<n;i++){
            sell[i]=buy[i]-prices[i];
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(sell[i]>0) ans+=sell[i];
        }
        return ans;
    }
}