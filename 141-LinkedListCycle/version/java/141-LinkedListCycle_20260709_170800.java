// Last updated: 7/9/2026, 5:08:00 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        ListNode slow=head;
15        ListNode fast=head;
16        while(fast!=null && fast.next!=null){
17            fast=fast.next.next;
18            slow=slow.next;
19            if(fast==slow)
20            return true;
21        }
22        return false;
23    }
24}