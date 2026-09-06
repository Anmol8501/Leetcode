// Last updated: 9/6/2026, 7:12:00 PM
1class Solution {
2    public int mirrorReflection(int p, int q) {
3        
4        while(q%2==0 && p%2==0){
5            q/=2;
6            p/=2;
7        }
8
9        if(p%2!=0 && q%2!=0) return 1;
10
11        else if(p%2!=0 && q%2==0) return 0;
12
13        else return 2;
14    }
15}