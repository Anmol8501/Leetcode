// Last updated: 9/5/2026, 11:38:44 PM
1class Solution {
2    public int minElement(int[] nums) {
3
4        for(int i=0;i<nums.length;i++){
5            int sum=0;
6            while(nums[i]>0){
7                sum=sum+nums[i]%10;
8                nums[i]/=10;
9            }
10            nums[i]=sum;
11        }
12
13        int min=45;
14        for(int num:nums){
15            if(num<min) min=num;
16        }
17        return min;
18    }
19}