// Last updated: 10/26/2026, 1:55:59 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> ans=new ArrayList<>();
4        List<Integer> list=new ArrayList<>();
5        return combsum(candidates,target,0,list,ans);
6    }
7    
8    private List<List<Integer>> combsum(int[] candidates, int target,int index,List<Integer> list,List<List<Integer>> ans){
9        if(index>=candidates.length || target<0) return ans;
10        else if(target==0){
11            ans.add(new ArrayList<>(list));
12            return ans;
13        }
14        list.add(candidates[index]);
15        combsum(candidates, target - candidates[index], index, list, ans);
16        list.remove(list.size() - 1);
17        combsum(candidates,target,index+1,list,ans);
18
19        return ans;
20    }
21}