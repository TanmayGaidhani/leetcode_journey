class Solution {
    public int maxRepeating(String sequence, String word) {
        // int count = 0;
        // int windowsize = word.length();
        // int maxCount = 0;
        // for(int i = 0;i <= sequence.length()-windowsize;i++){  //sequence.length()-windowsize tell how many substring are create
        //     if (word.equals(sequence.substring(i, i + windowsize))) {
        //         count++;
        //         maxCount = Math.max(maxCount, count);
        //     } else {
        //         count = 0;
        //     }
        // }
        // return maxCount;

        int count = 0;
        String temp = word;

        while (sequence.contains(temp)) {
            count++;
            temp += word;
        }

        return count;
    }
}