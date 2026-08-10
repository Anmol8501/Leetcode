// Last updated: 8/10/2026, 11:41:28 AM
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3         List<String> result = new ArrayList<>();
4        if(turnedOn>8) return result;
5        for (int hour = 0; hour < 12; hour++) {
6            for (int minute = 0; minute < 60; minute++) {
7                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {
8                    result.add(hour + ":" + 
9                                  (minute < 10 ? "0" + minute : minute));
10                }
11            }
12        }
13        return result;
14    }
15}