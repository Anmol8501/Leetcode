// Last updated: 8/15/2026, 11:01:50 PM
1class Solution {
2
3    public String intToRoman(int num) {
4        int numbers[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
5        int i=0;
6        String romanNumbers[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
7        StringBuilder sb=new StringBuilder();
8        while(num>0){
9            if(numbers[i]<=num){
10                sb.append(romanNumbers[i]);
11                num-=numbers[i];
12            }
13            else i++;
14        }
15        return sb.toString();
16    }
17}