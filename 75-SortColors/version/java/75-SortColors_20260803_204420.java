// Last updated: 8/3/2026, 8:44:20 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        int index=0;
4        int n=nums.length;
5        for(int i=0;i<n;i++){
6            if(nums[i]==0){
7                int temp=nums[index];
8                nums[index++]=nums[i];
9                nums[i]=temp;
10            }
11        }
12        for(int i=0;i<n;i++){
13            if(nums[i]==1){
14                int temp=nums[index];
15                nums[index++]=nums[i];
16                nums[i]=temp;
17            }
18        }
19        return;
20    }
21}