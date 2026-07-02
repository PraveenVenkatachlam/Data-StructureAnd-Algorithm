class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.tocharArray() ){
            if(ch =='('){
                stack.push(ch);
            }else if(ch ==')' ) {
                stack.pop(ch);
            }
            for(int i=s.length()-1;i>=0;i--){
              stack.push();
            }
        }
    }
}