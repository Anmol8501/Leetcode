// Last updated: 4/4/2026, 10:47:30 PM
1class Solution {
2    public String decodeCiphertext(String encodedText, int rows) {
3        int col=encodedText.length()/rows;
4        StringBuilder s = new StringBuilder();
5        int j=0;
6        while(j<col){
7            int i=0,g=j;
8            while(i<rows && g<col){
9                s.append(encodedText.charAt(i * col + g));
10                i++;
11                g++;
12            }
13            j++;
14        }
15        s.toString();
16        int end = s.length() - 1;
17        while (end >= 0 && s.charAt(end) == ' ') {
18            end--;
19        }
20        return s.substring(0, end + 1);
21    }
22}