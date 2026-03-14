// Last updated: 3/14/2026, 9:37:32 PM
1class Solution {
2    public long gcdSum(int[] nums) {
3        int[] arr=constructPrefixGcd(nums);
4        Arrays.sort(arr);
5        int l=0,r=arr.length-1;
6        long sum=0;
7        while(l<r){
8            sum+=gcd(arr[l],arr[r]);
9            l++;
10            r--;
11        }
12        return sum;
13    }
14        public static int gcd(int a, int b) {
15        while (b != 0) {
16            int temp = b;
17            b = a % b;
18            a = temp;
19        }
20        return a;
21    }
22
23    public static int[] constructPrefixGcd(int[] nums) {
24        int n = nums.length;
25        int[] prefixGcd = new int[n];
26
27        int mx = nums[0];
28
29        for (int i = 0; i < n; i++) {
30            mx = Math.max(mx, nums[i]);
31            prefixGcd[i] = gcd(nums[i], mx);
32        }
33
34        return prefixGcd;
35    
36    }
37}