// Last updated: 4/28/2026, 8:01:54 PM
class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        for(int i=0;i<n-1;i++){
            int j=i+1;
            boolean bool=false;
            while(!bool && j<n){
                if(prices[i]>=prices[j]){
                prices[i]=prices[i]-prices[j];
                j++;
                bool=true;
                break;
            }
            else j++;
            }
        }
        return prices;
    }
}