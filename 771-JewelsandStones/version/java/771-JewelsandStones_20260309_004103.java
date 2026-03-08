// Last updated: 3/9/2026, 12:41:03 AM
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        int count =0;
4        for(int i=0;i<jewels.length();i++){
5            for(int j=0;j<stones.length();j++){
6                if(jewels.charAt(i)==stones.charAt(j)) count++;
7            }
8        }
9        return count;
10    }
11}