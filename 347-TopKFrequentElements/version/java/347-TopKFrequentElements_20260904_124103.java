// Last updated: 9/4/2026, 12:41:03 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        ArrayList<Integer>[] list = new ArrayList[nums.length+1];
5        ArrayList<Integer> ans = new ArrayList<>();
6
7        for(int i=0;i<nums.length+1;i++){
8            list[i] = new ArrayList<>();
9        }
10
11        for(int num:nums){
12            map.put(num, map.getOrDefault(num, 0)+1);
13        }
14
15        for(int key:map.keySet()){
16            list[map.get(key)].add(key);
17        }
18
19        for(int i=list.length-1;i>=0 && k>0;i--){
20            if(list[i].size()>0){
21                for(int j=0;j<list[i].size();j++){
22                    ans.add(list[i].get(j));
23                    k--;
24                }
25            }
26        }
27        int[] arr = new int[ans.size()];
28        for(int i=0;i<ans.size();i++){
29            arr[i]=ans.get(i);
30        }
31        return arr;
32    }
33}