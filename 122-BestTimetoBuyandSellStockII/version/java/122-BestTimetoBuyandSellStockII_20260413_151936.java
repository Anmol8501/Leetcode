// Last updated: 4/13/2026, 3:19:36 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int n=prices.length;
4        int[] buy=new int[n];
5        for(int i=1;i<n;i++){
6            buy[i-1]=prices[i];
7        }
8        int[] sell=new int[n];
9        for(int i=0;i<n;i++){
10            sell[i]=buy[i]-prices[i];
11        }
12        int ans=0;
13        for(int i=0;i<n;i++){
14            if(sell[i]>0) ans+=sell[i];
15        }
16        return ans;
17    }
18}