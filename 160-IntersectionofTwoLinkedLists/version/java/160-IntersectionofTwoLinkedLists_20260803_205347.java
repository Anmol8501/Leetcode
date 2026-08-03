// Last updated: 8/3/2026, 8:53:47 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        while(headA!=null){
15            ListNode temp=headB;
16            while(temp!=null){
17                if(headA==temp)
18                    return temp;
19                temp=temp.next;
20            }
21            headA=headA.next;
22        }
23        return null;
24    }
25}