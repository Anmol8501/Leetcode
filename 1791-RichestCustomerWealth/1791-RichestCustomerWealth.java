// Last updated: 3/7/2026, 10:18:49 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int[] sum=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<accounts[0].length;j++){
                sum[i]=sum[i]+accounts[i][j];
            }
        }
        int max=sum[0];
        for(int i=1;i<n;i++){
            if(max<sum[i]){max=sum[i];}
        }
        return max;

    }
}