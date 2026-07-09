// Last updated: 7/9/2026, 5:39:58 PM
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
14        ListNode slow=head;
15        ListNode fast=head;
16        int len=0;
17        while(fast!=null && fast.next!=null){
18            fast=fast.next.next;
19            slow=slow.next;
20            if(fast==slow){
21                len++;
22                ListNode temp=slow.next;
23                while(temp!=fast && temp.next!=null){
24                    temp=temp.next;
25                    len++;
26                }
27            break;
28            }
29        }
30        if(len==0) return null;
31        ListNode f=head;
32        ListNode s=head;
33        while(len>0){
34            s=s.next;
35            len--;
36        }
37        while(f!=s){
38            f=f.next;
39            s=s.next;
40        }
41        return s;
42    }
43}