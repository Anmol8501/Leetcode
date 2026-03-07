// Last updated: 3/7/2026, 10:14:19 PM
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node to simplify head handling
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        // Attach remaining nodes
        cur.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}                                                                                                                                   
                                                            