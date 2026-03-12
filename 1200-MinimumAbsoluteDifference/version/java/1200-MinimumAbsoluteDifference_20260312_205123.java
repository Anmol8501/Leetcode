// Last updated: 3/12/2026, 8:51:23 PM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int res=arr[1]-arr[0];
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            minimum=Math.min(minimum,arr[i+1]-arr[i]);

        }
        List<List<Integer>>ans=new ArrayList<>();
                for(int i=0;i<arr.length-1;i++)
                {
                      if(arr[i+1]-arr[i]==minimum)
                      {
                        ans.add(Arrays.asList(arr[i],arr[i+1]));
                      }
                }

        return ans;
    }
}