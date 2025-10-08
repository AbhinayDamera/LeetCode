class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length + 1; // because one number is missing
        // int expectedSum = n * (n - 1) / 2;
        // int actualSum = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     actualSum += nums[i];
        // }
        // return expectedSum - actualSum;
        int n=nums.length;
        int actualSum=n*(n+1)/2;
        int sum=0;

        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        return actualSum-sum;
    }
}