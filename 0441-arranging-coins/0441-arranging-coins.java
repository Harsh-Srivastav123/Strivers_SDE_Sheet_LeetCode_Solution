class Solution {
    public int arrangeCoins(int n) {
        int c=0;
        for (int i=1;i<=n;i++){
            if((n-i)>=0){
                c++;
                n=n-i;
            }
        }
        return c;
    }
}