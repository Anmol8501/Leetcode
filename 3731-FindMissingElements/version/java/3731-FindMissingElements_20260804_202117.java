// Last updated: 8/4/2026, 8:21:17 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        Arrays.sort(nums);
4        List<Integer> list=new ArrayList<>();
5        int ele=nums[0];
6        for(int i=1;i<nums.length;i++){
7            if(ele+1!=nums[i]){ 
8                i--;
9                list.add(ele+1);
10            }
11            ele++;
12        }
13        return list;
14    }
15}