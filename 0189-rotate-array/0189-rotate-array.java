class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==0) return;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void reverse(int[] nums,int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}

// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         if (n == 0) return; // Edge case for empty array

//         // Normalize k to prevent out-of-bounds errors
//         k = k % n; 

//         // The reversal algorithm
//         reverse(nums, 0, n - 1);
//         reverse(nums, 0, k - 1);
//         reverse(nums, k, n - 1);

//         // No return statement is needed for a void method
//     }

//     public static void reverse(int[] nums, int start, int end) {
//         while (start < end) { // Use < instead of <= to avoid unnecessary swap when pointers meet
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }