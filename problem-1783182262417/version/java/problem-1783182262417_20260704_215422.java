// Last updated: 7/4/2026, 9:54:22 PM
1class Solution {
2    public List<String> letterCombinations(String digits) {
3        List<String> list=new ArrayList();
4        List<String> list1=new ArrayList();
5        String p="";
6        list=pad(digits,p,list1);
7        return list;
8    }
9    static List<String> pad(String digits,String p,List<String> list1){
10        if(digits.isEmpty()){
11            list1.add(p);
12            return list1;
13        }
14        int digit=digits.charAt(0)-'0';
15        if(digit==7){
16            for(int i=(digit-2)*3;i<=(digit-1)*3;i++){
17            char ch=(char)('a'+i);
18            pad(digits.substring(1),p+ch,list1);
19        }}
20        else if(digit==9){
21            for(int i=(digit-2)*3+1;i<=(digit-1)*3+1;i++){
22            char ch=(char)('a'+i);
23            pad(digits.substring(1),p+ch,list1);
24        }}
25        else if(digit==8){
26            for(int i=(digit-2)*3+1;i<=(digit-1)*3;i++){
27            char ch=(char)('a'+i);
28            pad(digits.substring(1),p+ch,list1);
29        }
30        }
31        else{
32            for(int i=(digit-2)*3;i<(digit-1)*3;i++){
33            char ch=(char)('a'+i);
34            pad(digits.substring(1),p+ch,list1);
35        }}
36        return list1;
37    }
38}