// Last updated: 3/7/2026, 10:13:53 PM
class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        s=s.toLowerCase();
        int a=0,b=n-1;
        while(a<b){
           if(!(s.charAt(a)>='a' && s.charAt(a)<='z' || s.charAt(a)>='0' && s.charAt(a)<='9')){
            a++;
            continue;
           }
           if(!(s.charAt(b)>='a' && s.charAt(b)<='z' || s.charAt(b)>='0' && s.charAt(b)<='9')){
            b--;
            continue;
           }
           if(!(s.charAt(a)==s.charAt(b))) return false;
           a++;
           b--;
        }
        return true;
    }
}