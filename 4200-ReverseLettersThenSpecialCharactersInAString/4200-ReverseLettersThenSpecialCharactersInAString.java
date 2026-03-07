// Last updated: 3/7/2026, 10:10:11 PM
class Solution {
    public String reverseByType(String s) {
        int n=s.length();
        if (n<2) return s;
        String sa="";
        String ss="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z') sa+=s.charAt(i);
            else ss+=s.charAt(i);
        }
        int k=sa.length();
        int l=ss.length();
        String ans="";
        for(int i=0;i<n;i++){
            if (s.charAt(i)>='a' && s.charAt(i)<='z'){
                ans+=sa.charAt(k-1);
                k--;
            }
            else {
                ans+=ss.charAt(l-1);
                l--;
            }
        }
        return ans;
    }
}