// Last updated: 3/7/2026, 10:18:52 PM
class Solution {
    public int maxRepeating(String sequence, String word) {
        int k=0;
        String temp=word;
        while(sequence.contains(temp)){
            k++;
            temp+=word;
        }
        return k;
    }
}