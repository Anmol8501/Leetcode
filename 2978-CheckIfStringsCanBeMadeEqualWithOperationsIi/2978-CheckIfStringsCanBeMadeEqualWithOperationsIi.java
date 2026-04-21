// Last updated: 4/21/2026, 2:24:48 PM
class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] odd=new int[26];
        int[] even=new int[26];
        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                even[(int)(s1.charAt(i)-'a')]++;
                even[(int)(s2.charAt(i)-'a')]--;
            }
            else{
                odd[(int)(s1.charAt(i)-'a')]++;
                odd[(int)(s2.charAt(i)-'a')]--;
            }
        }
        for(int i=0;i<26;i++){
            if(even[i]!=0 || odd[i]!=0) return false;
    }
    return true;
    }
}