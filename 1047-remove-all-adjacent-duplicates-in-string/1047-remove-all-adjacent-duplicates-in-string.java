// class Solution {
//     public String removeDuplicates(String s) {
//         Stack<Character> stack = new Stack<>();
//         for (int i = 0; i < s.length(); i++) {
//             char ch=s.charAt(i);

//             if(!stack.isEmpty() && stack.peek()==ch){
//                 stack.pop();
//             }else{
//                 stack.push(ch);
//             }
//         }
//         String result="";
//         for(int i=0; i<stack.size();i++){
//             result=result+stack.get(i);
//         }
//         return result;

//     }
// }


class Solution {
    public String removeDuplicates(String s) {

        Stack<Character>a1=new Stack<>();
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);

            if(!a1.isEmpty() && a1.peek()==ch){
                a1.pop();
            }
            else{
                a1.add(ch);
            }
        }
        String results="";
        for(int i=0; i<a1.size(); i++){
            results=results+a1.get(i);
        }
        return results;
    }

}