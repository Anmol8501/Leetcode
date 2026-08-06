// Last updated: 8/6/2026, 11:20:29 PM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        while(productOfDigits(n) % t != 0){
4            n++;
5        }
6        return n;
7    }
8
9    private int productOfDigits(int num){
10        int product = 1;
11        while(num != 0){
12            product *= num % 10;
13            num /= 10;
14        }
15        return product;
16    }
17}