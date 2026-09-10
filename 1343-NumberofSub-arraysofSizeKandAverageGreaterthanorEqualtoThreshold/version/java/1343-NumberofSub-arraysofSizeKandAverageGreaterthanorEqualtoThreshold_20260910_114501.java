// Last updated: 9/10/2026, 11:45:01 AM
1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3        int left=0;
4        int sum=0;
5        int count=0;
6
7        for(int right=0;right<arr.length;right++){
8            sum += arr[right];
9
10            if((right-left+1)==k){
11                if(sum/k>=threshold) count++;
12                sum -= arr[left];
13                left++;
14            }
15        }
16        return count;
17    }
18}