class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;       // ✅ Power of two must be positive
        if ((n & (n - 1)) == 0) {       // ✅ Parentheses are needed
            return true;
        }
        return false;
    }
}
