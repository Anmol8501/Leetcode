// Last updated: 3/13/2026, 8:35:33 AM
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        Arrays.sort(arr);
4        int mindiff=Integer.MAX_VALUE;
5        for(int i=1;i<arr.length;i++){
6            mindiff=Math.min(mindiff,Math.abs(arr[i]-arr[i-1]));
7        }
8        List<List<Integer>> res=new ArrayList<>();
9        for(int i=0;i<arr.length-1;i++){
10                if(Math.abs(arr[i+1]-arr[i])==mindiff){
11                    res.add(Arrays.asList(arr[i],arr[i+1]));
12        }}
13        return res;
14    }
15}