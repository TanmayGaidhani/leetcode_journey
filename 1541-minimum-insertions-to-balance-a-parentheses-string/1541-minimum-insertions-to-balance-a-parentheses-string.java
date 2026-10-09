class Solution {
    public int minInsertions(String s) {
        int insert = 0;
        int needed = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                needed += 2;
                if(needed % 2 != 0){ //need odd rahil tyala balance and count karasathi
                    insert++;
                    needed--;
                }
            }else{
                needed -= 1;
                if(needed < 0){
                    insert += 1;
                    needed = 1;
                }
            }
        }
        return insert + needed;
    }
}