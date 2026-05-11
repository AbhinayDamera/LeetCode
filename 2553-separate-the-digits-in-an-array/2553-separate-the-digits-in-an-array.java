class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>list =new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            String s=Integer.toString(nums[i]);
            for(int j=0; j<s.length(); j++){
                list.add(s.charAt(j)-'0');
            }
        }
        int[] ans=new int[list.size()];
        for(int i=0; i<ans.length; i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}