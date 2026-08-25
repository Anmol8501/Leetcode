// Last updated: 8/25/2026, 7:51:19 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int num:nums){
5            map.put(num,map.getOrDefault(num,0)+1);
6            if(map.get(num)==3) map.remove(num);
7        }
8        for(int key:map.keySet()){
9            if(map.get(key)==1) return key;
10        }
11        return -1;
12    }
13}