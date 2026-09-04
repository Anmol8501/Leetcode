// Last updated: 9/4/2026, 3:36:13 PM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3
4        List<List<Integer>> result=new ArrayList();
5        permutation(result,nums,new ArrayList());
6
7        return result;
8    }
9    static void permutation(List<List<Integer>> result, int[] nums,List<Integer> p){
10        if(nums.length==p.size()){
11            result.add(new ArrayList<>(p));
12            return;
13        }
14        for(int num:nums){
15            if(p.contains(num)) continue;
16            p.add(num);
17            permutation(result,nums,p);
18            p.remove(p.size()-1);
19        }
20    }
21}