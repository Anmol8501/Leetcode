// Last updated: 10/19/2026, 7:13:40 PM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        int[] freq = new int[101];
4
5        for(int num : nums){
6            freq[num]++;
7        }
8        int index = 0;
9        List<Integer> list = new ArrayList<>();
10        
11        for(int i = 1; i < 101; i++){
12            if(i == target){
13                while(freq[i]>0){
14                    list.add(index);
15                    index++;
16                    freq[i]--;
17                }
18                return list;
19            }
20            index += freq[i];
21        }
22        return list;
23    }
24}