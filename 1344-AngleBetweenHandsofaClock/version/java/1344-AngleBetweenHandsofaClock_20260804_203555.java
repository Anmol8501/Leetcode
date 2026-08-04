// Last updated: 8/4/2026, 8:35:55 PM
1class Solution {
2    public double angleClock(int hour, int minutes) {
3        double hangle=(hour%12)*30+minutes*0.5;
4        double mangle=minutes*6;
5        double angle=Math.abs(hangle-mangle);
6        if (angle>180) return 360-angle;
7        return angle;
8    }
9}