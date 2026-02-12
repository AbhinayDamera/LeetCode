class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int n : nums) {
            if ((n >= 10 && n <= 99) ||        // 2 digits
                (n >= 1000 && n <= 9999) ||    // 4 digits
                (n >= 100000 && n <= 999999))  // 6 digits
            {
                count++;
            }
        }

        return count;
    }
}
