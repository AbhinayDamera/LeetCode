class Solution {
    public int climbStairs(int n) {
        int[] ab = new int[n+1];
        if(n<2){
            return n;
        }
        //ab[0]=0;
        ab[1]=1;
        ab[2]=2;
        for(int i=3;i<=n;i++){
            ab[i]=ab[i-1]+ab[i-2];
        }
        return ab[n];
    }
}