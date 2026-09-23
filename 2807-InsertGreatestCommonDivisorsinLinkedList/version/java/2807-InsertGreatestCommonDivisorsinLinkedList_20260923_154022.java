// Last updated: 9/23/2026, 3:40:22 PM
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
12    public ListNode insertGreatestCommonDivisors(ListNode head) {
13        ListNode temp = head;
14
15        while(head.next!=null){
16            ListNode gcd = new ListNode(gcd(head.val,head.next.val));
17            gcd.next = head.next;
18            head.next = gcd;
19            head = head.next.next;
20        }
21        return temp;
22    }
23    int gcd(int a,int b){
24        while (b != 0) {
25            int temp = b;
26            b = a % b;
27            a = temp;
28        }
29        return a;
30    }
31}