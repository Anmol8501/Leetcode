// Last updated: 8/5/2026, 11:04:33 PM
1class Solution {
2    public int findTheWinner(int n, int k) {
3        ArrayList<Integer> circle=new ArrayList<>();
4        for(int i=1;i<=n;i++){
5            circle.add(i);
6        }
7        int curr=0;
8        while(circle.size()>1){
9            int remove=(curr+k-1)%circle.size();
10            circle.remove(remove);
11            curr=remove;
12        }
13        return circle.get(0);
14    }
15}