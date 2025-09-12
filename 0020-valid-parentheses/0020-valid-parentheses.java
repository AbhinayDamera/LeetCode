class Solution {
    public boolean isValid(String s) {
        Stack<Character> Valid =new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'|| s.charAt(i)=='('|| s.charAt(i)=='['){
                Valid.push(s.charAt(i));
            }
            else if(s.charAt(i)=='}'){
                if(Valid.size()==0){
                    return false;
                }
                else if(Valid.peek()!='{'){
                    return false;
                }
                else{
                    Valid.pop();
                }
            }
            else if(s.charAt(i)==']'){
                if(Valid.size()==0){
                    return false;
                }
                else if(Valid.peek()!='['){
                    return false;
                }
                else{
                    Valid.pop();
                }
            }
            else if(s.charAt(i)==')'){
                if(Valid.size()==0){
                    return false;
                }
                else if(Valid.peek()!='('){
                    return false;
                }
                else{
                    Valid.pop();
                }
            }
        }
        if(Valid.size()==0){
        return true;
        }
        else{
        return false;
        }
    }
}