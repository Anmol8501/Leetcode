// Last updated: 9/9/2026, 8:55:59 PM
1class Solution {
2    public long countCommas(long n) {
3        if(n<1000) return 0;
4
5        long comma = 0;
6
7        if(n>999) comma+=(n-999);
8
9        if(n>999999) comma+=(n-999999);
10
11        if(n>999999999L) comma+=(n-999999999L);
12
13        if(n>999999999999L) comma+=(n-999999999999L);
14
15        if(n>999999999999999L) comma+=(n-999999999999999L);
16
17
18        return comma;
19    }
20}