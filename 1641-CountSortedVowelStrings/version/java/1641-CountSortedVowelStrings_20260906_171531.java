// Last updated: 9/6/2026, 5:15:31 PM
1class Solution {
2    public int countVowelStrings(int n) {
3        int num=n+4;
4        int ans=fact(num,n);
5        int d=fact(num-n);
6
7        return ans/d;
8    }
9    int fact(int num,int n){
10        int factorial=1;
11        while(num>n){
12            factorial*=num;
13            num--;
14        }
15        return factorial;
16    }
17    int fact(int n){
18        int factorial=1;
19        while(n>1){
20            factorial*=n;
21            n--;
22        }
23        return factorial;
24    }
25}