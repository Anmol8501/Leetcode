// Last updated: 3/7/2026, 10:13:05 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
                swap(nums,i,correct);
            else i++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1)
            ans.add(j+1);
        }
        return ans;
    }
    void swap(int[] arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}