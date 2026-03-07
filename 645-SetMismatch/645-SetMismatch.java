// Last updated: 3/7/2026, 10:12:50 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct =nums[i]-1;
            if(nums[i]!=nums[correct])
                swap(nums,i,correct);
            else
                i++;
        }
        int[] res=new int[2];
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                res[0]=nums[j];
                res[1]=j+1;
                break;
            }
        }
        return res;
    }
    void swap(int[] nums,int i,int correct){
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;
    }
}