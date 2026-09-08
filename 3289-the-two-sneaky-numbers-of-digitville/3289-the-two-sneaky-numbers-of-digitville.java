// class Solution {
//     public int[] getSneakyNumbers(int[] nums) {
//         int n=nums.length;
//         int res[]=new int[2];
//         int idx=0;
//         Arrays.sort(nums);

//         for(int i=1; i<n; i++){
//             if(nums[i]==nums[i-1]){
//                 res[idx]=nums[i];
//                 idx++;
//             }
//         }
//         return res;
//     }
// }


class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        int[] freq = new int[101];   // assuming values range 0–100
        int[] res = new int[2];
        int idx = 0;

        // expanded for-each loop
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            freq[num]++;

            if (freq[num] == 2) {   // duplicate found
                res[idx] = num;
                idx++;
            }
        }

        return res;
    }
}