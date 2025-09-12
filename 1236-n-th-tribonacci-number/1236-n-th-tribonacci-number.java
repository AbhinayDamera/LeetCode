class Solution {
    public int tribonacci(int n) {
         if (n == 0) return 0;
        if (n == 1) return 1;
        if(n==2) return 1;

        int T0=0;
        int T1=1;
        int T2=1;
        int T3=0;
        
        for(int i=3; i<=n; i++){
            T3=T0+T1+T2;
             T0=T1;
             T1=T2;
             T2=T3;
        }
        return T3;
    }
}