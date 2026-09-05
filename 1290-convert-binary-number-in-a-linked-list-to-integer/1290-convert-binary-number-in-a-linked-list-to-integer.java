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
    public int getDecimalValue(ListNode head) {
        int size = 0;
        ListNode temp = head;

        while(temp != null){
            size++;
            temp = temp.next;
        }

        int number = 0;
        ListNode temp1 = head;
        while(temp1 != null){
            size--;
            number += (int)(temp1.val * Math.pow(2, size));
            temp1 = temp1.next;
        }
        return number;
    }
}