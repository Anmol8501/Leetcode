// Last updated: 3/18/2026, 10:03:29 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseList(ListNode head) {
13        if(head==null) return head;
14        ArrayList<Integer> list=new ArrayList<>();
15        while(head!=null){
16            list.add(head.val);
17            head=head.next;
18        }
19        ListNode temp=new ListNode(list.get(list.size()-1));
20        ListNode curr=temp;
21        for(int i=list.size()-2;i>=0;i--){
22            curr.next=new ListNode(list.get(i));
23            curr=curr.next;
24        }
25        return temp;
26    }
27}