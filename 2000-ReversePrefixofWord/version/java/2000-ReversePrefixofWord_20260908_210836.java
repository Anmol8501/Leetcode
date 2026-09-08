// Last updated: 9/8/2026, 9:08:36 PM
class Solution {
    public String reversePrefix(String word, char ch) {
        char arr[] = word.toCharArray();
        int ind = 0;
        for(ind=0;ind<arr.length;ind++){
            if(arr[ind] == ch) break;
        }
        if(ind == arr.length) return word;
        int st = 0;
        while(st <= ind){
            char t = arr[st];
            arr[st++] = arr[ind];
            arr[ind--] = t; 
        }
        return new String(arr);
    }
}