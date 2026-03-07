// Last updated: 3/7/2026, 10:18:37 PM
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int a=ruleKey.equals("type")?0:ruleKey.equals("color")?1:2;
        int b=0;
        
        for(List<String> item:items){if(item.get(a).equals(ruleValue)){b++;}}
        return b;
    }
}