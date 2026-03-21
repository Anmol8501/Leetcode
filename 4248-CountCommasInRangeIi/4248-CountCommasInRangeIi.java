// Last updated: 3/21/2026, 8:48:46 PM
class Solution {
    public long countCommas(long n) {
        long nal=n;
        long ans=0;
        long start=1000;
        int commas=1;
        while(start<=nal){
            long end=start*1000-1;
            long count=Math.min(nal,end)-start+1;
            if(count>0){
                ans+=count*commas;
            }
            start*=1000;
            commas++;
        }
        return ans;
    }
}