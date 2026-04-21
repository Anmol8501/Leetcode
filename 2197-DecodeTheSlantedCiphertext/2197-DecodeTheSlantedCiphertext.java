// Last updated: 4/21/2026, 2:25:04 PM
class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if(rows == 1)
            return encodedText;

        if(encodedText.length()== 0)
            return encodedText;

        int col=encodedText.length()/rows;
        StringBuilder s = new StringBuilder();
        int j=0;
        while(j<col){
            int i=0,g=j;
            while(i<rows && g<col){
                s.append(encodedText.charAt(i * col + g));
                i++;
                g++;
            }
            j++;
        }
        s.toString();
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        return s.substring(0, end + 1);
    }
}