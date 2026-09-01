// Last updated: 9/1/2026, 9:58:03 PM
1class Solution {
2    int result=0;
3    public int countArrangement(int n) {
4        int[] nums = new int[n+1];
5        dfs(nums,1,n);
6        return result;
7    }
8    private void dfs(int[] nums,int val,int n){
9        if(val>n){
10            result++;
11            return;
12        }
13        for(int i=1;i<=n;i++){
14            if(nums[i]==0 && (val%i==0 || i%val==0)){
15                nums[i]=val;
16                dfs(nums,val+1,n);
17                nums[i]=0;
18            }
19        }
20    }
21}