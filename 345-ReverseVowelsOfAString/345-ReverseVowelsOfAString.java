// Last updated: 3/7/2026, 10:13:14 PM
class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
       int i=0,j=s.length()-1;
       while(i<j){
       if (!isVowel(a[i])) {
                i++;
            } else if (!isVowel(a[j])) {
                j--;
            } else {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return new String(a);
    }

    boolean isVowel(char c) {
        return c=='A' || c=='E' || c=='I' || c=='O' || c=='U'
            || c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}