class Solution {
    public int[] constructRectangle(int area) {
        // First find out the squareroot
        int width = (int)Math.sqrt(area);

        // Find largest factor
        while(area % width != 0){
            width--;
        }

        // other fastor is length
        int length = area / width;

        return new int[]{length , width};
    }
}