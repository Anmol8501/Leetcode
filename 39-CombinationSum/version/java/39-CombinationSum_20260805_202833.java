// Last updated: 8/5/2026, 8:28:33 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> ans=new ArrayList<>();
4        List<Integer> list=new ArrayList<>();
5        return combsum(candidates,target,0,list,ans);
6    }
7    private List<List<Integer>> combsum(int[] candidates, int target,int index,List<Integer> list,List<List<Integer>> ans){
8        if(index>=candidates.length || target<0) return ans;
9        else if(target==0){
10            ans.add(new ArrayList<>(list));
11            return ans;
12        }
13        list.add(candidates[index]);
14        combsum(candidates, target - candidates[index], index, list, ans);
15        list.remove(list.size() - 1);
16        combsum(candidates,target,index+1,list,ans);
17
18        return ans;
19    }
20}