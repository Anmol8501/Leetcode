// Last updated: 3/7/2026, 10:14:22 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        StringBuilder ans=new StringBuilder();
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
       for (int i=0;i<Math.min(first.length(),last.length());i++){
           
           if (first.charAt(i)!=last.charAt(i)){
              break;

           }
           ans.append(first.charAt(i));
        }

        return ans.toString();
    }
}