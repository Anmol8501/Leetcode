// Last updated: 3/7/2026, 10:13:19 PM
class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int x=0;x<=n;x++){
            int i=x;
            int count=0;
            while(i!=0){
                count+=(i&1);
                i=i>>1;
            }
            arr[x]=count;
        }
        return arr;
    }
}