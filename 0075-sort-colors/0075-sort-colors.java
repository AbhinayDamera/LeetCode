class Solution {
    public void sortColors(int[] nums) {

        int n=nums.length;
        int mid=0;
        int low=0;
        int high=n-1;

        while(mid<=high){
        if(nums[mid]==1){
            mid++;
        }
        else if (nums[mid] == 0) {
                // manual swap with low
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }
         else { // nums[mid] == 2
                // manual swap with high
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;

                high--;
            }
    }
    }
}