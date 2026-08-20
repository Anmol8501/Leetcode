// Last updated: 8/20/2026, 9:51:13 AM
1class Solution {
2    public int[] resultArray(int[] nums) {
3        int n=nums.length;
4        int[] arr=new int[n-1];
5        int k=0,j=1;
6        arr[0]=nums[1];
7        nums[1]=0;
8
9        for(int i=2;i<n;i++){
10            if(nums[k]<arr[j-1]){
11                arr[j]=nums[i];
12                nums[i]=0;
13                j++;
14            }
15            else{
16                k=i;
17            }
18        }
19        int[] result=new int[n];
20        int a=0;
21
22        for(int i=0;i<n;i++){
23            if(nums[i]>0){
24            result[a]=nums[i];
25            a++;
26            }
27        }
28
29        int b=0;
30        for(int i=a;i<n;i++){
31            result[i]=arr[b];
32            b++;
33        }
34        return result;
35    }
36}