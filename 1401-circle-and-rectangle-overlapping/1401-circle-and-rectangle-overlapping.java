class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        // for finding the closest x-coordinate of rectangle
        int xClosest = Math.max(x1,Math.min(x2,xCenter));

        // for finding the closest y-cordinate of rectangle
        int yClosest = Math.max(y1,Math.min(y2,yCenter));

        // distance of circle with closest point 
        int dx = xCenter - xClosest;
        int dy = yCenter - yClosest;

        // Compare squared distance with squared radius
        return dx * dx + dy * dy <= radius * radius;
    }
}