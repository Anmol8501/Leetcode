// Last updated: 3/7/2026, 10:18:03 PM
class Solution {
    public int numOfStrings(String[] patterns, String word) {     
        int a=0;
        for (int i=0;i<patterns.length;i++){
            StringBuilder s=new StringBuilder();
            s.append(patterns[i]);
            if(word.contains(s)){
                a++;
            }}
            return a;
        }
    }
