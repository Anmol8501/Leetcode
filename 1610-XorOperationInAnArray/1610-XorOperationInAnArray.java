// Last updated: 3/7/2026, 10:19:03 PM
class Solution {
    public int xorOperation(int n, int start) {
        int ans=0;
        for(int i=0;i<n;i++){
            int num=(start + 2 * i);
            ans=ans^num;
        }
        return ans;
    }
}