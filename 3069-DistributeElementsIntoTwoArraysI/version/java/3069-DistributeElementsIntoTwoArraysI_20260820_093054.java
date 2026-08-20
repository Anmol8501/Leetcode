// Last updated: 8/20/2026, 9:30:54 AM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        int n=nums.length;
4        ArrayList<Integer> l1=new ArrayList<>();
5        ArrayList<Integer> l2=new ArrayList<>();
6        l1.add(nums[0]);
7        l2.add(nums[1]);
8        int i1=0,i2=0;
9        for(int i=2;i<n;i++){
10            if(l1.get(i1)>l2.get(i2)){
11                l1.add(nums[i]);
12                i1++;
13            }
14            else{
15                l2.add(nums[i]);
16                i2++;
17            }
18        }
19        for(int i=0;i<l2.size();i++){
20            l1.add(l2.get(i));
21        }
22        int[] arr=new int[n];
23        for(int i=0;i<l1.size();i++){
24            arr[i]=l1.get(i);
25        }
26        return arr;
27    }
28}