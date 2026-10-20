class Solution {
    public int maxArea(int[] height) {
        // ArrayList<Integer>list = new ArrayList<>();

        // // STored in arraylist
        // for(int hig : height){
        //     list.add(hig);
        // }
        // //Perform twopointer approach on arrayList
        // int LP = 0;
        // int RP = list.size()-1;
        // int maxwater=0;

        // while(LP < RP){
        //    int heights = Math.min(list.get(LP),list.get(RP));
        //    int width = RP-LP;
        //    int currwater = heights*width;
        //     maxwater = Math.max(maxwater,currwater);

        //     if(list.get(LP) < list.get(RP)){
        //     // if(LP< RP){  this give error 
        //         LP++;
        //     }else{
        //         RP--;
        //     }
        // }
        // return maxwater;

        // without using arraylist
        int left =0;
        int right = height.length -1;
        int maxAre = 0;

        while(left < right){
            int curr = Math.min(height[left],height[right])*(right-left);
            maxAre = Math.max(maxAre , curr);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxAre;
    }
}