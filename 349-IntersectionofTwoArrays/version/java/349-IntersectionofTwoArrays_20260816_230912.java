// Last updated: 8/16/2026, 11:09:12 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> set=new HashSet<>();
4        ArrayList<Integer> list=new ArrayList<>();
5        for(int i=0;i<nums1.length;i++){
6            set.add(nums1[i]);
7        }
8        for(int i=0;i<nums2.length;i++){
9            if(set.contains(nums2[i])){
10                list.add(nums2[i]);
11                set.remove(nums2[i]);
12            }
13        }
14        int[] num=new int[list.size()];
15        for(int i=0;i<list.size();i++){
16            num[i]=list.get(i);
17        }
18        return num;
19    }
20}