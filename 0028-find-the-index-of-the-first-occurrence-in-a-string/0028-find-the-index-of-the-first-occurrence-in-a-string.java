class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: if needle is empty, return 0
        if (needle.isEmpty()) {
            return -1;
        }
        
        // Use String's indexOf method for simplicity
        return haystack.indexOf(needle);
    }
}


// class Solution {
//     public int strStr(String haystack, String needle) {
//         if (haystack.contains(needle)) {
//             return 0;
//         }

//     return -1;
//     }
// }