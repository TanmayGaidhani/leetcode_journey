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
    public ListNode mergeKLists(ListNode[] lists) {
        // Using the priorityQueue minHeap comcept use
        // check the base condition
        if(lists == null || lists.length == 0){
            return null;
        }
        // compare the value of a and b for ascending arder
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)-> a.val-b.val);
        // list are sorted
        // adding first element of all listnode as they smallest
        for(ListNode node : lists){
            if(node != null){
                minHeap.offer(node);
            }
        }
        ListNode result = new ListNode(0);
        ListNode current = result;

        while(!minHeap.isEmpty()){
            ListNode minNode = minHeap.poll();
            // adding in result
            current.next = minNode;
            current = current.next;

            // check the element in the list
            if(minNode.next != null){
                minHeap.offer(minNode.next);
            }
        }
        return result.next;
    }
}