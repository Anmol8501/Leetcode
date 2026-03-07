// Last updated: 3/7/2026, 10:10:47 PM
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int x = nums.get(i); 
            if((x & 1) == 0){
                arr[i] = -1;
                continue;
            }
            int bit = 1;
            while((x & bit) != 0){
                bit <<= 1;
            } 
            arr[i] = x ^ (bit >> 1);
        }
        return arr;
    }
}