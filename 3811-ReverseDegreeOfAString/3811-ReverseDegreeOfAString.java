// Last updated: 3/21/2026, 8:49:03 PM
class Solution {
    public int reverseDegree(String s) {
        int k=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            k='z'-s.charAt(i)+1;
            int prod=k*(i+1);
            sum+=prod;
        }
        return sum;
    }
}