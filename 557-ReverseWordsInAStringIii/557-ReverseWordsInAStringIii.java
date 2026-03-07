// Last updated: 3/7/2026, 10:12:53 PM
class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        String[] arr =s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String word:arr){
            StringBuilder s2=new StringBuilder(word);
            result.append(s2.reverse()).append(" ");
        }

        return result.toString().trim();
    }
}