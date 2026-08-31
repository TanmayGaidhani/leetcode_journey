class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        // Base case: less than 3 nodes
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nextNode = head.next.next;

        int firstCritical = -1;
        int lastCritical = -1;
        int previousCritical = -1;

        int minDistance = Integer.MAX_VALUE;
        int position = 2;

        while (nextNode != null) {

            // Check whether curr is a critical point
            if ((curr.val > prev.val && curr.val > nextNode.val) ||
                (curr.val < prev.val && curr.val < nextNode.val)) {

                // First critical point
                if (firstCritical == -1) {
                    firstCritical = position;
                } 
                // Another critical point
                else {
                    minDistance = Math.min(minDistance,position - previousCritical);
                }
                previousCritical = position;
                lastCritical = position;
            }
            // Move the three pointers
            prev = curr;
            curr = nextNode;
            nextNode = nextNode.next;

            position++;
        }

        // Fewer than two critical points
        if (firstCritical == -1 || firstCritical == lastCritical) {
            return new int[]{-1, -1};
        }

        int maxDistance = lastCritical - firstCritical;

        return new int[]{minDistance, maxDistance};
    }
}