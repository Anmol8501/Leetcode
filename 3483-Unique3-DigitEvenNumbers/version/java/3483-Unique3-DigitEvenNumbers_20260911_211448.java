// Last updated: 9/11/2026, 9:14:48 PM
1class Solution {
2    public int totalNumbers(int[] digits) {
3        HashSet<Integer> set = new HashSet<>();
4        int n = digits.length;
5        for(int i=0;i<n;i++){
6            for(int j=0;j<n;j++){
7                for(int k=0;k<n;k++){
8                    if(digits[k]%2==0 && digits[i]!=0){
9                    if((i==j || j==k || k==i)) continue;
10                    int num = digits[i]*100+digits[j]*10+digits[k];
11                    set.add(num);
12                    }
13                }
14            }
15        }
16        return set.size();
17    }
18}