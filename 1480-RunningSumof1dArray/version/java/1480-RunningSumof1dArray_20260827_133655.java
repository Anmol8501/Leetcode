// Last updated: 8/27/2026, 1:36:55 PM
1class NumArray {
2    private int[] arr;
3    public NumArray(int[] nums) {
4        int n=nums.length;
5        arr=new int[n+1];
6        arr[0]=nums[0];
7        for(int i=1;i<=n;i++){
8            arr[i]=arr[i-1]+nums[i-1];
9        }
10    }
11    
12    public int sumRange(int left, int right) {
13        return arr[right+1]-arr[left];
14    }
15}
16
17/**
18 * Your NumArray object will be instantiated and called as such:
19 * NumArray obj = new NumArray(nums);
20 * int param_1 = obj.sumRange(left,right);
21 */