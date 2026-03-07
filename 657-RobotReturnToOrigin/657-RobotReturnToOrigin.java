// Last updated: 3/7/2026, 10:12:48 PM
class Solution {
    public boolean judgeCircle(String moves) {
        int a=0;
        int b=0;
        int n=moves.length();
        for(int i=0;i<n;i++){
            if((moves.charAt(i))=='R'){a++;}
            else if(moves.charAt(i)=='L'){a--;}
            else if(moves.charAt(i)=='U'){b++;}
            else if(moves.charAt(i)=='D'){b--;}
        }
        return (a==0)&&(b==0);
    }
}