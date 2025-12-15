class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] s1charArray=s.toCharArray();
        char[] s2charArray=t.toCharArray();

        Arrays.sort(s1charArray);
        Arrays.sort(s2charArray);

        if(Arrays.equals(s1charArray,s2charArray)){
            return true;
        }
        else{
            return false;
        }
        
    }
}