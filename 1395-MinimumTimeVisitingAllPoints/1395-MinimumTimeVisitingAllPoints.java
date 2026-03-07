// Last updated: 3/7/2026, 10:12:20 PM
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res=0;
        int x1=points[0][0],y1=points[0][1];
        for(int i=1;i<points.length;i++){
            int x2=points[i][0];
            int y2=points[i][1];
            res+=Math.max(Math.abs(x2-x1),Math.abs(y2-y1));
            x1=x2;
            y1=y2;
        }
        return res;
    }
}