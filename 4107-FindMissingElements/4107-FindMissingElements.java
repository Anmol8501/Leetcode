// Last updated: 3/7/2026, 10:10:18 PM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int j=1,i=1;
        while((j+nums[0])!=nums[nums.length-1]){
            if(j+nums[0]!=nums[i]) list.add(nums[0]+j);
            else i++;
            j++;
        }
        return list;
    }
}