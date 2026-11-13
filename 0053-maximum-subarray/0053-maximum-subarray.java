// class Solution {
//     public int maxSubArray(int[] nums) {
//         int dp[] = new int[nums.length];
//         dp[0]=nums[0];
//         int ans=dp[0];
//         for(int i=1; i<nums.length;i++){
//             dp[i]=nums[i]+Math.max(0,dp[i-1]);
//             ans=Math.max(ans,dp[i]);
//         }
//         return ans;

//     }
// }

class Solution {
    public int maxSubArray(int[] nums) {
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        int ans=dp[0];
        for(int i=1; i<nums.length; i++){
            dp[i]=nums[i]+Math.max(0,dp[i-1]);
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}

// // // // class Solution {
// // // //     public int maxSubArray(int[] nums) {
// // // //        int dp[] = new int[nums.length];
// // // //        dp[0]=nums[0];
// // // //        int ans=nums[0];
// // // //        for(int i=1; i<nums.length; i++){
// // // //             dp[i]=nums[i]+Math.max(0,dp[i-1]);
// // // //             ans=Math.max(ans,dp[i]);
// // // //        }
// // // //        return ans;
// // // //     }
// // // // }

// // // class Solution {
// // //     public int maxSubArray(int[] nums) {
// // //         int dp[]=new int[nums.length];
// // //         dp[0]=nums[0];
// // //         int ans=nums[0];
// // //         for(int i=1; i<nums.length; i++){
// // //             dp[i]=nums[i]+Math.max(0,dp[i-1]);
// // //             ans=Math.max(ans,dp[i]);
// // //         }
// // //         return ans;
// // //     }
// // // }

// // class Solution {
// //     public int maxSubArray(int[] nums) {
// //         int dp[]=new int[nums.length];
// //         dp[0]=nums[0];
// //         int ans=nums[0];
// //         for(int i=1; i<nums.length; i++){
// //             dp[i]=nums[i]+Math.max(0,dp[i-1]);
// //             ans=Math.max(ans,dp[i]);
// //         }
// //         return ans;
// //     }
// // }

// // class Solution {
// //     public int maxSubArray(int[] nums) {
// //         int dp[]= new int[nums.length];
// //         dp[0]=nums[0];
// //         int ans=nums[0];
// //         for(int i=1; i<nums.length; i++){
// //             dp[i]=nums[i]+Math.max(0,dp[i-1]);
// //             ans=Math.max(ans,dp[i]);
// //         }
// //         return ans;
// //     }
// // }
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSum = Integer.MIN_VALUE;

//         for (int i = 0; i < nums.length; i++) {
//             int sum = 0;

//             for (int j = i; j < nums.length; j++) {
//                 sum += nums[j];

//                 maxSum = Math.max(maxSum, sum);
//             }
//         }

//         return maxSum;
//     }
// }