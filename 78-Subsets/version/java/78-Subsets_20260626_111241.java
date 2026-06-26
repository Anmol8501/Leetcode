// Last updated: 6/26/2026, 11:12:41 AM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> list=new ArrayList();
4        list.add(new ArrayList());
5        for(int num:nums){
6            int n=list.size();
7            for(int i=0;i<n;i++){
8                List<Integer> sub=new ArrayList(list.get(i));
9                sub.add(num);
10                list.add(sub);
11            }
12        }
13        return list;
14    }
15}