// Last updated: 3/21/2026, 8:48:48 PM
class Solution {
    public long gcdSum(int[] nums) {
        int[] arr=constructPrefixGcd(nums);
        Arrays.sort(arr);
        int l=0,r=arr.length-1;
        long sum=0;
        while(l<r){
            sum+=gcd(arr[l],arr[r]);
            l++;
            r--;
        }
        return sum;
    }
        public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int[] constructPrefixGcd(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];

        int mx = nums[0];

        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, nums[i]);
            prefixGcd[i] = gcd(nums[i], mx);
        }

        return prefixGcd;
    
    }
}