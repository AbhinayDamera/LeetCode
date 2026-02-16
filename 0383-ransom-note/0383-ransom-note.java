class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freqArray = new int[26];

        // Count characters from magazine
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            freqArray[c - 'a']++;
        }

        // Check ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            if (freqArray[c - 'a'] == 0) {
                return false;
            }
            freqArray[c - 'a']--;
        }

        return true;
    }
}
