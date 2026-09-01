// Last updated: 9/1/2026, 10:08:56 PM
1class Solution {
2    int result=0;
3    public int countArrangement(int n) {
4        int[] nums = new int[n+1];
5        for(int i=1;i<=n;i++) nums[i]=i;
6        dfs(nums,n);
7        return result;
8    }
9    private void dfs(int[] nums,int val){
10        if(val==0){
11            result++;
12            return;
13        }
14        for(int i=val;i>0;i--){
15            swap(nums,i,val);
16            if(nums[val]%val==0 || val%nums[val]==0)
17                dfs(nums,val-1);
18            swap(nums,i,val);
19        }
20        }
21        void swap(int[] nums,int i,int j){
22            int temp=nums[i];
23            nums[i]=nums[j];
24            nums[j]=temp;
25    }
26}