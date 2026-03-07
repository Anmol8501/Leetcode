// Last updated: 3/7/2026, 10:18:45 PM
class Solution {
    public boolean halvesAreAlike(String s) {
        s.toLowerCase();
        int n=s.length();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        s1.append(s.substring(0,n/2));
        s2.append(s.substring(n/2));
        int a=0,b=0;
        for(int i=0;i<n/2;i++){
            switch(s1.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'u': a++;break;
            }
            switch(s2.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'u': b++;break;
            }
        }

        return a==b;
    }
}