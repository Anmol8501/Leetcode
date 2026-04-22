// Last updated: 4/22/2026, 8:58:53 PM
1class Solution {
2    public List<String> twoEditWords(String[] queries, String[] dictionary) {
3        ArrayList<String> list=new ArrayList<>();
4        for(int i=0;i<queries.length;i++){
5            boolean found=true;
6            for(int j=0;j<dictionary.length && found;j++){
7                if(queries[i].equals(dictionary[j])){
8                        list.add(queries[i]);
9                        found=false;
10                        break;
11                    }
12                int edit=0;
13                for(int k=0;k<queries[i].length();k++){   
14                    if(queries[i].charAt(k)!=dictionary[j].charAt(k)) edit++;
15                }
16                if(edit<3){
17                    list.add(queries[i]);
18                    found=false;
19                }
20                if(!found) break;
21            }
22        }
23        return list;
24    }
25}