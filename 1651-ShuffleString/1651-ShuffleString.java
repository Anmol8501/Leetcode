// Last updated: 3/7/2026, 10:18:56 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        int n=indices.length;
        char[] res=new char[n]; 
        for(int i=0;i<n;i++){
            res[indices[i]]=s.charAt(i);
            }
        
        return new String(res);
    }
}