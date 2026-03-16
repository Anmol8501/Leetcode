// Last updated: 3/16/2026, 10:31:37 PM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        if(head == null) return null;
4        ListNode current = head;
5        while(current.next != null){
6            if(current.val == current.next.val){
7                current.next = current.next.next;
8            } 
9            else{
10                current = current.next;
11            }
12        }
13        return head;
14    }
15}