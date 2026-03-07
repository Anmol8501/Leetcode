// Last updated: 3/7/2026, 10:12:03 PM
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n=arr2.length;
        int a=0;
        for(int i:arr1){
            int b=0; 
            for(int j:arr2){
                if((i-j)>d||(i-j)<-d)b++;
            
                else break;}
            if(b==n)a++;
        }
        return a;
    }
}