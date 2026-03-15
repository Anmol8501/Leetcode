// Last updated: 3/15/2026, 6:44:13 PM
class Solution { // Time Complexity --> O(n)
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0; // depth decides how deep we are into the parenthesis string

        // when depth == 0, then we have to skip that string
        for(char c : s.toCharArray()){// here, enhanced for loop is used.
            if(c == '('){
                if(depth > 0){ 
                    result.append(c);

                }
                depth++;

            }
            else{ // this condn says if ( c== ')', then it decreases the depth by 1.
                depth--; 
                if(depth > 0){
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}