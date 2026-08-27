// Last updated: 8/27/2026, 1:30:13 PM
1class NumArray {
2    private int[] arr;
3    public NumArray(int[] nums) {
4        int n=nums.length;
5        arr=new int[n];
6
7        for(int i=0;i<n;i++){
8            arr[i]=nums[i];
9        }
10    }
11    
12    public int sumRange(int left, int right) {
13        int sum=0;
14        for(int i=left;i<=right;i++){
15            sum+=arr[i];
16        }
17        return sum;
18    }
19}
20
21/**
22 * Your NumArray object will be instantiated and called as such:
23 * NumArray obj = new NumArray(nums);
24 * int param_1 = obj.sumRange(left,right);
25 */