// Last updated: 3/7/2026, 10:11:17 PM
class Solution {
    public int[] findArray(int[] pref) {
        int xor=0;
        int[] arr=new int[pref.length];
        arr[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            xor=xor^arr[i-1];
            arr[i]=xor^pref[i];
        }
        return arr;
    }
}