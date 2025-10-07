// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         double maxAvg=-10000;
//         for(int i=0; i<=nums.length-k; i++){
//             int sum=0;

//             for(int j=1;j<i+k;j++){
//                 sum+=nums[j];
//             }
//             double avg=sum/k;

//             if(avg>maxAvg){
//                 maxAvg=avg;
//             }
//         }
//         return maxAvg;
//     }
// }

// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         double maxAvg = -10000; // Set to a very small number

//         for (int i = 0; i <= nums.length - k; i++) {
//             int sum = 0;

//             // Add k elements starting from index i
//             for (int j = i; j < i + k; j++) {
//                 sum += nums[j];
//             }

//             double avg = (double) sum / k;

//             // Update maxAvg if a bigger average is found
//             if (avg > maxAvg) {
//                 maxAvg = avg;
//             }
//         }

//         return maxAvg;
//     }
// }


class Solution {
    public double findMaxAverage(int[] nums, int k) {
    
    int left=0;
    int curSum=0;
    int maxSum=0;

    for(int i=0; i<k;i++){
        curSum+=nums[i];
    }
    maxSum=curSum;
    for(int right=k; right<nums.length;right++){
        curSum-=nums[left];
        left++;
        curSum+=nums[right];
        //right++;
        maxSum=Math.max(maxSum,curSum);
    }
    return (double)maxSum/k;
    }
    
}