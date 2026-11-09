class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev_no=0;

        while(x>0){
            int Digit=x%10;
            rev_no=rev_no*10+Digit;
            x=x/10;
        }
        if(rev_no == temp){
            return true;
        }
        return false;
    }
}