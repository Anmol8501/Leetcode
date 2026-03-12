// Last updated: 3/12/2026, 8:35:40 PM
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        Arrays.sort(arr);
4        int mindiff=Math.abs(arr[0]-arr[1]);
5        for(int i=2;i<arr.length;i++){
6            mindiff=Math.min(mindiff,Math.abs(arr[i]-arr[i-1]));
7        }
8        List<List<Integer>> res=new ArrayList<>();
9        int j=0;
10        for(int i=1;i<arr.length;i++){
11            List<Integer> list=new ArrayList<>();
12                if(Math.abs(arr[i]-arr[j])==mindiff){
13                    list.add(arr[j]);
14                    list.add(arr[i]);
15                    j++;
16            }
17             else if(Math.abs(arr[i]-arr[i-1])==mindiff){
18                    list.add(arr[i-1]);
19                    list.add(arr[i]);}
20            if(list.size()>0)
21            res.add(list);
22        }
23        return res;
24    }
25}