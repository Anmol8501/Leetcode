// Last updated: 3/7/2026, 10:19:08 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        List<Boolean> brr=new ArrayList<>(n);
        int max=candies[0];
        for(int i=1;i<n;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            brr.add(candies[i]+extraCandies>=max);
        }
        return brr;
    }
}