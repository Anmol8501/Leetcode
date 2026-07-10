// Last updated: 7/10/2026, 11:15:40 PM
1class Solution {
2    public boolean isPalindrome(ListNode head) {
3        ListNode mid=middleNode(head);
4        ListNode headSecond=reverseList(mid);
5        ListNode reverseHead=headSecond;
6
7        while(head!=null && headSecond!=null){
8            if(head.val!=headSecond.val) break;
9            head=head.next;
10            headSecond=headSecond.next;
11        }
12        reverseList(reverseHead);
13        return head==null || headSecond==null;
14    }
15    public ListNode middleNode(ListNode head){
16        ListNode slow=head;
17        ListNode fast=head;
18        while(fast!=null && fast.next!=null){
19            slow=slow.next;
20            fast=fast.next.next;
21        }
22        return slow;
23    }
24    public ListNode reverseList(ListNode head){
25        if(head==null) return head;
26
27        ListNode curr=head;
28        ListNode prev=null;
29        while(curr!=null){
30            ListNode next=curr.next;
31            curr.next=prev;
32            prev=curr;
33            curr=next;
34        }
35        return prev;
36    }
37}