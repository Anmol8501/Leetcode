// Last updated: 8/30/2026, 8:37:31 PM
1class Solution {
2    public int[] relativeSortArray(int[] arr1, int[] arr2) {
3        HashMap<Integer, Integer> map=new HashMap<>();
4
5        for(int num:arr1){
6            map.put(num, map.getOrDefault(num,0)+1);
7        }
8
9        int i=0;
10        int[] arr=new int[arr1.length];
11        
12        for(int num:arr2){
13            while(map.get(num)>0){
14                arr[i++]=num;
15                map.put(num,map.get(num)-1);
16            }
17        }
18        ArrayList<Integer> list = new ArrayList<>();
19        for(int key:map.keySet()){
20            while(map.get(key)>0){
21                list.add(key);
22                map.put(key,map.get(key)-1);
23            }
24        }
25        Collections.sort(list);
26
27        for(int num:list){
28            arr[i++]=num;
29        }
30        return arr;
31    }
32}