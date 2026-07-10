// Last updated: 7/10/2026, 1:40:50 PM
1class Solution {
2    public boolean isHappy(int n) {
3        int slow=n;
4        int fast=n;
5        do{
6            slow=square(slow);
7            fast=square(square(fast));
8        }while(slow!=fast);
9        if(slow==1) return true;
10        return false;
11    }
12    private int square(int num){
13        int ans=0;
14        while(num>0){
15            int rem=num%10;
16            ans+=rem*rem;
17            num/=10;
18        }
19        return ans;
20    }
21}