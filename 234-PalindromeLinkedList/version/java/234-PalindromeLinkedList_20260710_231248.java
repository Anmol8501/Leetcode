// Last updated: 7/10/2026, 11:12:48 PM
1class Solution {
2    public boolean isPalindrome(ListNode head) {
3        ListNode mid=middleNode(head);
4        ListNode headSecond=reverseList(mid);
5        ListNode reverseHead=headSecond;
6
7        while(head!=null && headSecond!=null){
8            if(head.val!=headSecond.val) return false;
9            head=head.next;
10            headSecond=headSecond.next;
11        }
12        return true;
13    }
14    public ListNode middleNode(ListNode head){
15        ListNode slow=head;
16        ListNode fast=head;
17        while(fast!=null && fast.next!=null){
18            slow=slow.next;
19            fast=fast.next.next;
20        }
21        return slow;
22    }
23    public ListNode reverseList(ListNode head){
24        if(head==null) return head;
25
26        ListNode curr=head;
27        ListNode prev=null;
28        while(curr!=null){
29            ListNode next=curr.next;
30            curr.next=prev;
31            prev=curr;
32            curr=next;
33        }
34        return prev;
35    }
36}