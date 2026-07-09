// Last updated: 7/9/2026, 5:44:03 PM
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
13    public ListNode detectCycle(ListNode head) {
14    ListNode slow=head;
15    ListNode fast=head;
16    while(fast !=null && fast.next!=null){
17        slow=slow.next;
18        fast=fast.next.next;
19
20        if(slow==fast){
21            ListNode pointer=head;
22            while(pointer!=slow){
23                pointer=pointer.next;
24                slow=slow.next;
25            }
26            return pointer; 
27        }
28    }
29        return null;
30    }
31}