class Solution {
    public int countGoodSubstrings(String s) {
        int count =0;
        for(int i=0 ; i<= s.length()-3 ; i++){
          char a = s.charAt(i);
          char b = s.charAt(i+1);
          char c = s.charAt(i+2);

          if(a!=b && b!=c && c!=a){
            count++;
          }
        }
        return count;
    }
}

// class Solution {
//     public int countGoodSubstrings(String s) {
//         int n = s.length();
//         if (n < 3) return 0;

//         int[] freq = new int[26];
//         int count = 0;

//         // first window of size 3
//         for (int i = 0; i < 3; i++) {
//             freq[s.charAt(i) - 'a']++;
//         }

//         if (isDistinct(freq)) count++;

//         // slide the window
//         for (int i = 3; i < n; i++) {
//             // add new character (right side)
//             freq[s.charAt(i) - 'a']++;

//             // remove old character (left side)
//             freq[s.charAt(i - 3) - 'a']--;

//             if (isDistinct(freq)) count++;
//         }

//         return count;
//     }

//     private boolean isDistinct(int[] freq) {
//         int unique = 0;
//         for (int i = 0; i < freq.length; i++) {
//             if (freq[i] > 0) {
//                 unique++;
//             }
//         }
//         if (unique == 3){
//             return true;
//         }
//         return false;   
//     }
// }