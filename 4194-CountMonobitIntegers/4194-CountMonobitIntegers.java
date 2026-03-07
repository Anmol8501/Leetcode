// Last updated: 3/7/2026, 10:10:13 PM
class Solution {
    public int countMonobit(int n) {
        int i=1;
        int count=0;
        int mono=0;
        while (mono<n){
            mono=mono+i*2;
            i*=2;
            count++;
        }
        return count+1;
    }
}