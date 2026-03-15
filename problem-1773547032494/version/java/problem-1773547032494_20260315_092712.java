// Last updated: 3/15/2026, 9:27:12 AM
1class Solution {
2    public long countCommas(long n) {
3        long nal=n;
4        long ans=0;
5        long start=1000;
6        int commas=1;
7        while(start<=nal){
8            long end=start*1000-1;
9            long count=Math.min(nal,end)-start+1;
10            if(count>0){
11                ans+=count*commas;
12            }
13            start*=1000;
14            commas++;
15        }
16        return ans;
17    }
18}