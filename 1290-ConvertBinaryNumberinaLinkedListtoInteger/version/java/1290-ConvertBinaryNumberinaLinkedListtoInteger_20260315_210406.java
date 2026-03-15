// Last updated: 3/15/2026, 9:04:06 PM
1class Solution {
2    public int getDecimalValue(ListNode head) {
3        ArrayList<Integer> arr=new ArrayList<>();
4        while(head!=null){
5            arr.add(head.val);
6            head=head.next;
7        }
8        int k=1;
9        int n=0;
10        for(int i=arr.size()-1;i>=0;i--){
11            n+=arr.get(i)*k;
12            k*=2;
13        }
14        return n;
15    }
16}