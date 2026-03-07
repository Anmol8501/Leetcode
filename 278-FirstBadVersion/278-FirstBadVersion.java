// Last updated: 3/7/2026, 10:13:27 PM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1,end=n;
        while(start<=end){
            int firstBad=start+(end-start)/2;
            if(isBadVersion(firstBad)) end=firstBad-1;
            else start=firstBad+1;

        }
        return start;
    }
}