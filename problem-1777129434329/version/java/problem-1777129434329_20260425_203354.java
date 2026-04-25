// Last updated: 4/25/2026, 8:33:54 PM
1class Solution {
2    public int compareBitonicSums(int[] nums) {
3        int n=nums.length;
4        int max=nums[0];
5        int peek=0;
6        for(int i=1;i<n;i++){
7            if(nums[i]>max){
8                max=nums[i];
9                peek=i;
10            }
11        }
12        long sum1=0,sum2=0;
13        for(int i=0;i<=peek;i++) sum1+=nums[i];
14        for(int i=peek;i<n;i++) sum2+=nums[i];
15        if(sum1>sum2) return 0;
16        if(sum1<sum2) return 1;
17        return -1;
18    }
19}