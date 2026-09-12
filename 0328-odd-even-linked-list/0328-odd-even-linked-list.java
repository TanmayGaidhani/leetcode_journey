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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        // First odd and the even node
        ListNode odd = head;
        ListNode even = head.next;

        // Save satrting node of even list
        ListNode evenHead = even;

        while(even != null && even.next != null){
            // Connect current odd node to next odd
            odd.next = even.next;
            odd = odd.next;
            // Connect current even to even node
            even.next = odd.next;
            even = even.next;
        }
        // Attach even to odd
        odd.next = evenHead;
        return head;
    }
}