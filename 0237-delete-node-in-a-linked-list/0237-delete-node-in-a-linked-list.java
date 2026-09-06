/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // Copy the value of the next node
        node.val = node.next.val;
        
        // Remove the next node by changing the pointer
        node.next = node.next.next;
    }
}