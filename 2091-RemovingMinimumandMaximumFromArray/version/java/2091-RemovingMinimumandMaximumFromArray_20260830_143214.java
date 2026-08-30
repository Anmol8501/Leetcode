// Last updated: 8/30/2026, 2:32:14 PM
1class Solution {
2    public int minimumDeletions(int[] nums) {
3        int max=Integer.MIN_VALUE;
4        int min=Integer.MAX_VALUE;
5        int n=nums.length;
6        int deletions=0;
7        for(int i=0;i<n;i++){
8            if(nums[i]<min) min=nums[i];
9            if(nums[i]>max) max=nums[i];
10        }
11        boolean a=false, b=false, c=false, d=false, e=false, f=false;
12        for(int i=0;i<n;i++){
13            if(nums[i]==max) a=true;
14            if(nums[i]==min) b=true;
15            if(a==true && b==true){
16                deletions=i+1;
17                break;
18            }
19        }
20        for(int i=n-1;i>=0;i--){
21            if(nums[i]==max) c=true;
22            if(nums[i]==min) d=true;
23            if(c==true && d==true){
24                deletions=Math.min(deletions,n-i);
25                break;
26        }
27        }
28        int l=0,r=n-1;
29        while(!f && !e){
30            while(!e){
31                if(nums[l]==min || nums[l]==max){
32                    e=true;
33                }
34                l++;
35            }
36            while(!f){
37                if(nums[r]==min || nums[r]==max){
38                    f=true;
39                }
40                r--;
41            }
42        }
43        deletions=Math.min(deletions,l + (n - 1 - r));
44        return deletions;
45    }
46}