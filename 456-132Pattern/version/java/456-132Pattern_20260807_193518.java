// Last updated: 8/7/2026, 7:35:18 PM
1class Solution {
2    public boolean find132pattern(int[] nums) {
3        int n=nums.length;
4        if(n<3) return false;
5        Stack<Integer> stack=new Stack<>();
6        stack.push(nums[n-1]);
7        int[] aux=new int[n];
8        aux[0]=nums[0];
9        for(int k=1;k<n;k++){
10            aux[k]=Math.min(nums[k],aux[k-1]);
11        }
12        for(int j=n-2;j>=0;j--){
13            if(nums[j]>aux[j]){
14                while(!stack.isEmpty() && stack.peek() <=aux[j]){
15                stack.pop();
16                }
17                if(!stack.isEmpty() && stack.peek()<nums[j]) return true;
18                stack.push(nums[j]);
19            }
20        }
21        return false;
22    }
23}