class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int res[]=new int[2];
        int idx=0;
        Arrays.sort(nums);

        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                res[idx]=nums[i];
                idx++;
            }
        }
        return res;
    }
}