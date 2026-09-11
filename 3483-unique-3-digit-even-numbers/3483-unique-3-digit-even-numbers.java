class Solution {
    public int totalNumbers(int[] digits) {
        boolean []numcount = new boolean[1000];

        for(int i=0;i<digits.length;i++){
            //first digit cannot zero
            if(digits[i]==0){
                continue;
            }
            for(int j=0;j<digits.length;j++){
                // for not use the same number copy twice
                if(i==j){
                    continue;
                }

                for(int k = 0;k<digits.length;k++){
                    // cannot use the same copy for that
                    if(k==i || k == j){
                        continue;
                    }
                    // for the even number at last digit
                    if(digits[k] %2 != 0){
                        continue;
                    }

                    int num = digits[i]*100+digits[j]*10+digits[k];

                    numcount[num]=true;
                }
            } 
        }

        int count =0;
        for(int i= 100;i<=999;i=i+2){
            if(numcount[i]){
                count++;
            }
        }
        return count;
    }
}