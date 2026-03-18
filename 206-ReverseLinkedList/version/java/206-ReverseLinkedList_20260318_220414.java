// Last updated: 3/18/2026, 10:04:14 PM
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
14        if(head.next==null) return head;
15        ArrayList<Integer> list=new ArrayList<>();
16        while(head!=null){
17            list.add(head.val);
18            head=head.next;
19        }
20        ListNode temp=new ListNode(list.get(list.size()-1));
21        ListNode curr=temp;
22        for(int i=list.size()-2;i>=0;i--){
23            curr.next=new ListNode(list.get(i));
24            curr=curr.next;
25        }
26        return temp;
27    }
28}