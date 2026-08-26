// Last updated: 8/26/2026, 9:48:19 PM
1class Solution {
2    public char kthCharacter(int k) {
3        String ans=find(k,"a");
4        return ans.charAt(k-1);
5    }
6    private String find(int k, String s){
7        int n=s.length();
8        if(n>=k){
9            return s;
10        }
11        else{
12            for(int i=0;i<n;i++){
13                s+=String.valueOf((char)(s.charAt(i)+1));
14            }
15            s=find(k,s);
16        }
17        return s;
18    }
19}