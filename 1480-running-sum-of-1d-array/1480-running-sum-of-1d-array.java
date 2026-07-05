class Solution {
    public int[] runningSum(int[] nums) {
        int len=nums.length;
        int[] sum = new int[len];
        sum[0]=nums[0];
        for(int i=1; i<len; i++){
            sum[i]=sum[i-1]+nums[i];
        }
        return sum;
    }
}