// Last updated: 9/4/2026, 4:13:22 PM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        boolean[] used = new boolean[nums.length];
4        List<List<Integer>> result=new ArrayList();
5        permutation(result,nums,new ArrayList(),used);
6
7        return result;
8    }
9    static void permutation(List<List<Integer>> result, int[] nums,List<Integer> p, boolean[] used){
10        if(nums.length==p.size()){
11            result.add(new ArrayList<>(p));
12            return;
13        }
14        for(int i=0;i<nums.length;i++){
15            if(used[i]) continue;
16            used[i]=true;
17            p.add(nums[i]);
18            permutation(result,nums,p,used);
19            p.remove(p.size()-1);
20            used[i]=false;
21        }
22    }
23}