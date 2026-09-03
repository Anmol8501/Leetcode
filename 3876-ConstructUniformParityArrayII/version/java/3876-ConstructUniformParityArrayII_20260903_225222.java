// Last updated: 9/3/2026, 10:52:22 PM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int odd=0, even=0;
4        int n=nums1.length;
5
6        for(int num:nums1){
7            if(num%2==0) even++;
8            else odd++;
9        }
10
11        if(even==n || odd==n) return true;
12
13        int mineven=Integer.MAX_VALUE, minodd=Integer.MAX_VALUE;
14
15        for(int num:nums1){
16            if(num<mineven && num%2==0) mineven=num;
17            if(num<minodd && num%2!=0) minodd=num;
18        }
19        return minodd<mineven;
20    }
21}