// Last updated: 3/7/2026, 10:18:43 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] ans=new int[n+1];
        ans[0]=0;
        for(int i=0;i<n;i++){
            ans[i+1]=ans[i]+gain[i];
            }
        int max=ans[0];
        for(int i=1;i<=n;i++){
            if(max<ans[i]){max=ans[i];}
        }
        return max;
    }
}