// Last updated: 3/7/2026, 10:18:25 PM
class Solution {
    public String sortSentence(String s) {
      String[] arr = s.split(" ");
        int a = arr.length;
        String[] ar = new String[a];

        for(int i = 0; i < a; i++){
            char k = arr[i].charAt(arr[i].length() - 1); 
            String word = arr[i].substring(0, arr[i].length() - 1);
            ar[k - '1'] = word;
        }

        return String.join(" ", ar);
 
    }
}