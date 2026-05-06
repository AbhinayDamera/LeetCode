class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> a1 = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(!a1.isEmpty() && a1.peek() == ch){
                a1.pop();
            }
            else{
                a1.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < a1.size(); i++){
            result.append(a1.get(i));
        }

        return result.toString();
    }
}


// class Solution {
//     public String removeDuplicates(String s) {

//         Stack<Character>a1=new Stack<>();
//         for(int i=0; i<s.length();i++){
//             char ch=s.charAt(i);

//             if(!a1.isEmpty() && a1.peek()==ch){
//                 a1.pop();
//             }
//             else{
//                 a1.add(ch);
//             }
//         }
//         String results="";
//         for(int i=0; i<a1.size(); i++){
//             results=results+a1.get(i);
//         }
//         return results;
//     }

// }