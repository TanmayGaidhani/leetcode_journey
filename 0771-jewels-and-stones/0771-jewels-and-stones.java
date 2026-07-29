class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : stones.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0;
        // int sum =0;
        // for (Map.Entry<Character,Integer> entry : map.entrySet()){
        //     if(i<jewels.length()){
        //         if(jewels.charAt(i)==entry.getKey()){
        //             sum+= entry.getValue();
        //         }
        //         i++;
        //     }
        // }
        // return sum;

        int sum = 0;

        // Check every jewel
        for (char ch : jewels.toCharArray()) {
            sum += map.getOrDefault(ch, 0);
        }
        return sum;
    }
}