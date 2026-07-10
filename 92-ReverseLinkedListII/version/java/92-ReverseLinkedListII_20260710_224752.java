// Last updated: 7/10/2026, 10:47:52 PM
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3        if(left==right) return head;
4
5        ListNode present=head;
6        ListNode prev=null;
7        for(int i=0;i<left-1 && present!=null ;i++){
8            prev=present;
9            present=present.next;
10        }
11        ListNode last=prev;
12        ListNode newEnd=present;
13        
14        ListNode next=present.next;
15        for(int i=0;i<right-left+1 && present!=null;i++){
16            present  .next=prev;
17            prev=present;
18            present=next;
19            if(next!=null) next=next.next;
20        }
21        if(last!=null) last.next=prev;
22        else head=prev;
23
24        newEnd.next=present;
25        return head;
26    }
27}