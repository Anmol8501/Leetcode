// Last updated: 8/8/2026, 5:16:30 PM
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3         List<String> result = new ArrayList<>();
4        
5        for (int hour = 0; hour < 12; hour++) {
6            for (int minute = 0; minute < 60; minute++) {
7                int totalBits = Integer.bitCount(hour) + Integer.bitCount(minute);
8                if (totalBits == turnedOn) {
9                    String time = hour + ":" + 
10                                  (minute < 10 ? "0" + minute : minute);
11                    result.add(time);
12                }
13            }
14        }
15        return result;
16    }
17}