// class Solution {
//     public int majorityElement(int[] nums) {
//         // Arrays.sort(nums);
//         // int n=nums.length;
//         // return nums[n/2];
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int i=0; i<nums.length; i++){
            if(count==0){
                candidate=nums[i];
            }
            if(nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}
