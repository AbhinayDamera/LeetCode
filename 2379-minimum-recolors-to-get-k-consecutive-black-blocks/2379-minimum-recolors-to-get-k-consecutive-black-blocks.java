class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int curCnt = 0;
        int minCnt = Integer.MAX_VALUE;
        
        // Count 'W's in the first window of size k
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') curCnt++;
        }
        minCnt = curCnt;

        // Slide the window
        for (int right = k; right < blocks.length(); right++) {
            if (blocks.charAt(left) == 'W') curCnt--;
            if (blocks.charAt(right) == 'W') curCnt++;
            
            minCnt = Math.min(minCnt, curCnt);
            left++;
        }
        return minCnt;
    }
}
