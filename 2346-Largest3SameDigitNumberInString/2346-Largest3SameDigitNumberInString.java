// Last updated: 3/7/2026, 10:11:28 PM
class Solution {
    public String largestGoodInteger(String num) {
      for(int i=9;i>=0;i--){
        String a=Integer.toString(i);
        if(num.contains(a+a+a))
         return Integer.toString(i)+Integer.toString(i)+Integer.toString(i);
      }  
      return "";
    }
}