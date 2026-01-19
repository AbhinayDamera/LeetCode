class Solution {
    public String reverseOnlyLetters(String s) {

        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {

            if (!Character.isLetter(ch[start])) {
                start++;
            }
            else if (!Character.isLetter(ch[end])) {
                end--;
            }
            else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;

                start++;
                end--;
            }
        }

        return String.valueOf(ch);
    }
}
