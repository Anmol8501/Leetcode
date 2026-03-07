// Last updated: 3/7/2026, 10:18:20 PM
class Solution {
    public int countTriples(int n) {
        int a=0,b=0,c=0;
        int z=0;
        for(int i=1;i<=n;i++){
            c=i;
            for(int j=1;j<c;j++){
                a=j;
                for(int k=j+1;k<c;k++){
                    b=k;
                    if(c*c==a*a+b*b)
                       z++;
                }
            }
        }
        return z*2;
    }
}