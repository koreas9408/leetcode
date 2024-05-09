/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       if (head == null || head.next == null) {
            return head;
        }

        ListNode point1 = head;
        ListNode point2 = point1.next;
        head.next = null;

        while (point1 != null && point2 != null) {
            ListNode t = point2.next;
            point2.next = point1;
            point1 = point2;
            point2 = t;
        }
        
        return point1;
    }
}