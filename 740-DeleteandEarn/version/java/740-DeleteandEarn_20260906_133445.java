// Last updated: 9/6/2026, 1:34:45 PM
1class Solution {
2    public int deleteAndEarn(int[] nums) {
3        int[] count=new int[10001];
4
5        for(int num:nums){
6            count[num]+=num;
7        }
8
9        int prev1=0;
10        int prev2=0;
11
12        for(int i=0;i<count.length;i++){
13            int curr=Math.max(prev1,(prev2+count[i]));
14            prev2=prev1;
15            prev1=curr;
16        }
17        return prev1;
18    }
19}