class Solution {
    public static int product(int n){
        int pro=1;
        while(n !=0){
            int digit = n%10;
            pro *= digit;
            n/=10;
        }
        return pro;
    }
    public int smallestNumber(int n, int t) {
        while(product(n)%t!=0){
            n++;
        }
        return n;
    }
}