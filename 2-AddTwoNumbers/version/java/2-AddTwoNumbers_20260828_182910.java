// Last updated: 8/28/2026, 6:29:10 PM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13
14        ListNode temp=new ListNode(0);
15        ListNode curr=temp;
16        int carry=0;
17
18        while(l1!=null || l2!=null || carry!=0){
19            int sum=carry;
20
21            if(l1!=null){
22                sum+=l1.val;
23                l1=l1.next;
24            }
25
26            if(l2!=null){
27                sum+=l2.val;
28                l2=l2.next;
29            }
30
31            curr.next = new ListNode(sum % 10);
32            carry=sum/10;
33
34            curr=curr.next;
35        }
36        return temp.next;
37    }
38}